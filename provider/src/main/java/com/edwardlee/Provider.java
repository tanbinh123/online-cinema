package com.edwardlee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 本地服务提供者客户端
 * @author 李健成
 */
public class Provider
{
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext-provider.xml"
        );
        context.start();

        try {
            System.in.read();  // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
