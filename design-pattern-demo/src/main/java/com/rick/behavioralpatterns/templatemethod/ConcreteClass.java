package com.rick.behavioralpatterns.templatemethod;

/**
 * @author fengrui
 * @date 2022/5/22
 * @description 具体子类
 */
public class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}
