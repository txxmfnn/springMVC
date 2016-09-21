package com.paincupid.springmvc.application.annotation.HelloExample;


import java.lang.reflect.InvocationTargetException;  
import java.lang.reflect.Method;  
 
public class ParseAnnotationStub {  
     
   //��װ����Java�����ķ������䣨��Χ�Ǵ��������ض�ע��ķ�����  
   //��������Ҫִ�е����ͣ���������ʱ������ĳЩ���Ҫ���Ƕ��������ҵķ�Χ����ǰ��׺ʲô��  
   //�������÷���ֵΪ��void ����Objectͨ�ã���������Ϊ�˲��Բ���String����ֵ  
   public String parseMethod(Class<?> clazz) throws IllegalArgumentException,  
           IllegalAccessException, InvocationTargetException,  
           SecurityException, NoSuchMethodException, InstantiationException {  
         
       //��øö���  
       Object obj = clazz.getConstructor(new Class[]{}).newInstance(new Object[]{});  
         
       //�����ö���ķ���  
       for (Method method : clazz.getDeclaredMethods()) {  
    	   System.out.println("class name: " + clazz.getName() + "method name: " + method.getName());
    	   
           //��ȡ������ע�⣬�����ض���ȡ������@HelloWorldע��  
           HelloWorldAnnotation say = method.getAnnotation(HelloWorldAnnotation.class);  
                         
           //���@HelloWorldע�ⲻ�գ���������@HelloWorldע��  
           if (say != null) {  
                 
               //����������ǰ������   UseHelloWorld.sayHello(String name)����  
               //������Դ�ע���л�ȡֵ������ֱ�����У����߻���ö��󷽷�  
               String name = say.name();  
               //return (String)method.invoke(obj, name);
               System.out.println("name::: "+name);
           }  
             
           
       }  
       return "";  
   }  
} 