package com.paincupid.springmvc.application.annotation.currClass;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;
 

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
 

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
 

import com.paincupid.springmvc.application.annotation.currClass.BusUserlogModel;
import com.paincupid.springmvc.log.OpLogger;

/**
 * �����������ģ����вο���ֵ
 * @author arthur.paincupid.lee
 *
 */
//@Aspect
@Component
public  class SystemLogAspect {
    //ע��Service���ڰ���־�������ݿ�    
    /*@Resource   
    private BusUserlogService busUserlogService;*/
    //�����쳣��־��¼����    
    private  static  final Logger logger = LoggerFactory.getLogger(SystemLogAspect. class);
     
    //Controller���е�
    //@Pointcut("@annotation(com.paincupid.springmvc.application.annotation.currClass.OpLogger)")
    public  void controllerAspect() {
    }    
     
    /**  
     * ǰ��֪ͨ ��������Controller���¼�û��Ĳ��� 
     *
     * @param joinPoint �е�
     */
    //@AfterReturning(pointcut="controllerAspect()")
    public  void doBefore(JoinPoint joinPoint) {
        handleLog(joinPoint,null);
    }
     
     
//    @AfterReturning(pointcut="controllerAspect()",argNames = "joinPoint,retVal",returning = "retVal")
    @AfterThrowing(value="controllerAspect()",throwing="e")
    public void doAfter(JoinPoint joinPoint,Exception e)
    {
        handleLog(joinPoint,e);
    }
 
private void handleLog(JoinPoint joinPoint,Exception e) {
    try {
        //���ע��
        OpLogger controllerLog = giveController(joinPoint);
        if(controllerLog == null)
        {
            return;
        }
        //Mock��ȡ��ǰ���û�
        String userId = "123456879";
        String userName = "lee";
        String url = "www.google.com";
        HttpServletRequest  request = null;
        //*========���ݿ���־=========*//    
        BusUserlogModel userlogModel = new BusUserlogModel();
        //�����IP
        String ip = "192.168.0.1"; //get from request
        userlogModel.setUserIp(ip);
        userlogModel.setCreateTIme(new Date());
        userlogModel.setUrl(url);

        userlogModel.setUserId(userId);
        userlogModel.setUserName(userName);
         
        if(e != null)
            userlogModel.setErrorMessage(e.getMessage());
         
        //��������ע���ϵĲ���
        getControllerMethodDescription(controllerLog,userlogModel,request);
        //�������ݿ�
        //busUserlogService.insert(userlogModel);
        System.out.println(userlogModel.getUserId()+", "+userlogModel.getUserName());
      }  catch (Exception exp) {
       //��¼�����쳣��־
       logger.error("==ǰ��֪ͨ�쳣==");
       logger.error("�쳣��Ϣ:{}", exp.getMessage());
       exp.printStackTrace();
      }
}
     
    /**  
     * ��ȡע���жԷ�����������Ϣ ����Controller��ע��
     *  
     * @param joinPoint �е�
     * @return ��������
     * @throws Exception
     */   
     public  static void getControllerMethodDescription(OpLogger controllerLog,BusUserlogModel userlogModel,HttpServletRequest request)  throws Exception { 
        //����action����
        /*userlogModel.setAction(controllerLog.action());
        //���ñ���
        userlogModel.setTitle(controllerLog.title());
        //����channel
        userlogModel.setChannel(controllerLog.channel());
        //�Ƿ���Ҫ����request��������ֵ
        if(controllerLog.isSaveRequestData())
        {
            //��ȡ��������Ϣ�����뵽���ݿ��С�
            setRequestValue(userlogModel,request);
        }*/
     }
 
     /**
      * ��ȡ����Ĳ������ŵ�log��
      * @param userlogModel
      * @param request
      */
    @SuppressWarnings("rawtypes")
    private static void setRequestValue(BusUserlogModel userlogModel,HttpServletRequest request) {
        if(userlogModel == null)
            userlogModel = new BusUserlogModel();
        Map map = request.getParameterMap();
        String params = map.toString();
        userlogModel.setRequestParam(params);
    }
     
    /**
     * �Ƿ����ע�⣬������ھͼ�¼��־
     * @param joinPoint
     * @param controllerLog
     * @return
     * @throws Exception
     */
    private static OpLogger giveController(JoinPoint joinPoint) throws Exception
    {
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;  
        Method method = methodSignature.getMethod();  
         
        if(method != null)
        {
            return method.getAnnotation(OpLogger.class);
        }
        return null;
    }
}