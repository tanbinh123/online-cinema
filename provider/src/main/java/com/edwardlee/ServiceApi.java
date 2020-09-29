package com.edwardlee;

/**
 * 服务对外暴露的接口
 * @author EdwardLee
 * @date 2020/9/29
 */
public interface ServiceApi {
    /**
     * 发送 消息
     * @param message 消息内容
     * @return 封装的消息
     */
    String sendMessage(String message);
}
