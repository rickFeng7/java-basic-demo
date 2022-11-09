package com.rick.behavioralpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengrui
 * @date 2022/5/23
 * @description 抽象目标
 */
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    // 增加观察者方法
    public void add(Observer observer) {
        observers.add(observer);
    }

    // 删除观察者方法
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    // 通知观察者方法
    public abstract void notifyObserver();
}
