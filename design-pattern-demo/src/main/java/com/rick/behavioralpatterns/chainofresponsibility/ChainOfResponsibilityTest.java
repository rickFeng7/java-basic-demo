package com.rick.behavioralpatterns.chainofresponsibility;

/**
 * @author fengrui
 * @date 2022/5/23
 * @description
 */
public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        // 组装责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        // 提交请求
        handler1.handleRequest("two");
    }
}
