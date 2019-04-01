package org.choc.demo.client;

import org.choc.demo.cxf.proxy.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-client.xml");
        HelloService helloService = context.getBean("helloService",HelloService.class);
        String res = helloService.say("123");
        System.out.println(res);
    }

}