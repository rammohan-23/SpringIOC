package com.rammohan.spring.autowiring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Human 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Body bodyObj = context.getBean("body", Body.class);
        bodyObj.startPump();
    }
}
