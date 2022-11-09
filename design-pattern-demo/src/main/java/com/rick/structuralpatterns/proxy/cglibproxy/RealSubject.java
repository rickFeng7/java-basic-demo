package com.rick.structuralpatterns.proxy.cglibproxy;


/**
 * @author fengrui
 * @date 2022/5/17
 * @description 被代理类
 */
public class RealSubject {
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}
