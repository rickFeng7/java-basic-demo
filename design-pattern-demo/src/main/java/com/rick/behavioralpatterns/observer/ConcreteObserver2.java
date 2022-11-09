package com.rick.behavioralpatterns.observer;

/**
 * @author fengrui
 * @date 2022/5/23
 * @description 具体观察者2
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}
