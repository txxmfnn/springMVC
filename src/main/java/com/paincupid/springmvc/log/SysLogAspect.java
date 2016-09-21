package com.paincupid.springmvc.log;

import java.lang.reflect.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.paincupid.springmvc.log.OpLogger.OpType;

/**
 * 
 * @author arthur.paincupid.lee
 * @since 2016.01.18
 */
@Aspect
@Component
public class SysLogAspect {
	private  static  final Logger logger = LoggerFactory.getLogger(SysLogAspect. class);
	
	@Pointcut("@annotation(com.paincupid.springmvc.log.OpLogger)")
	public void controllerAspect() {
	}

	@Before("controllerAspect()")
	public void doBefore(JoinPoint joinPoint) {
		System.out.println("=====SysLogAspectǰ��֪ͨ��ʼ=====");
		handleLog(joinPoint, null);
	}
	
	@AfterReturning(pointcut="controllerAspect()")
    public  void doAfter(JoinPoint joinPoint) {
		System.out.println("=====SysLogAspect����֪ͨ��ʼ=====");
        handleLog(joinPoint,null);
    }
	
	@AfterThrowing(value="controllerAspect()",throwing="e")
	public void doAfter(JoinPoint joinPoint, Exception e) {
		System.out.println("=====SysLogAspect�쳣֪ͨ��ʼ=====");
		handleLog(joinPoint, e);
	}

	private void handleLog(JoinPoint joinPoint,Exception e) {
	    try {
	        //���ע��
	        OpLogger logger = giveController(joinPoint);
	        if(logger == null)
	        {
	            return;
	        }
	        
	        String signature = joinPoint.getSignature().toString(); // ��ȡĿ�귽��ǩ��
			String methodName = signature.substring(signature.lastIndexOf(".") + 1,
					signature.indexOf("("));

			String longTemp = joinPoint.getStaticPart().toLongString();
			String classType = joinPoint.getTarget().getClass().getName();

			Class<?> clazz = Class.forName(classType);

			Method[] methods = clazz.getDeclaredMethods();
			System.out.println("methodName: " + methodName);

			for (Method method : methods) {

				if (method.isAnnotationPresent(OpLogger.class)
						&& method.getName().equals(methodName)) {
					//OpLogger logger = method.getAnnotation(OpLogger.class);
					String annId = logger.id();
					OpType type = logger.type();
					String clazzName = clazz.getName();
					System.out.println("clazzName: " + clazzName+ ", methodName: " 
							+ methodName + ", annId: "+ annId + ", type: "+type.toString());
				}
			}
			
	    } catch (Exception exp) {
	        logger.error("�쳣��Ϣ:{}", exp.getMessage());
	        exp.printStackTrace();
	       }
	}

	private static OpLogger giveController(JoinPoint joinPoint) throws Exception {
		Signature signature = joinPoint.getSignature();
		MethodSignature methodSignature = (MethodSignature) signature;
		Method method = methodSignature.getMethod();

		if (method != null) {
			return method.getAnnotation(OpLogger.class);
		}
		return null;
	}
	
	
	public void insertLogSuccess(JoinPoint jp, OpLogger logger) {}

	public void writeLogInfo(JoinPoint joinPoint, OpLogger opLogger)
			throws Exception, IllegalAccessException {}
}