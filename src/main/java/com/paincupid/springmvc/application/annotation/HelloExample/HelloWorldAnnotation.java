package com.paincupid.springmvc.application.annotation.HelloExample;

import java.lang.annotation.Documented;  
import java.lang.annotation.ElementType;  
import java.lang.annotation.Retention;  
import java.lang.annotation.RetentionPolicy;  
import java.lang.annotation.Target;  
  
@Retention(RetentionPolicy.RUNTIME)//ע�����class�д��ڣ�����ʱ��ͨ�������ȡ  
@Target(ElementType.METHOD)//Ŀ���Ƿ���  
@Documented//�ĵ�����ʱ����ע�⽫��������javadoc�У���ȥ��  
public @interface HelloWorldAnnotation {  
      
    public String name() default "-1";  
      
} 