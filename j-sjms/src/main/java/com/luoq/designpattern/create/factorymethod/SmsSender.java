package com.luoq.designpattern.create.factorymethod;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
