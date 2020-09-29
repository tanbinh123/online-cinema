package com.edwardlee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * 消费者客户端
 * @author EdwardLee
 * @date 2020/9/29
 */
public class Consumer {
    public static void main(String[] args) {
        String applicationContextName = "applicationContext-consumer.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(applicationContextName);
        context.start();
        Scanner scanner = new Scanner(System.in);
        ServiceApi serviceApi = (ServiceApi) context.getBean("demoService");
        while (true) {
            String string = scanner.nextLine();
            System.out.println(serviceApi.sendMessage(string));
            if ("0000".equals(string)) {
                break;
            }
        }
    }
}
