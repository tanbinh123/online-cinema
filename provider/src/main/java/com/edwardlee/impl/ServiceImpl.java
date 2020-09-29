package com.edwardlee.impl;

import com.edwardlee.ServiceApi;

/**
 * @author EdwardLee
 * @date 2020/9/29
 */
public class ServiceImpl implements ServiceApi {

    @Override
    public String sendMessage(String message) {
        return "在线影院 发送消息：" + message;
    }
}
