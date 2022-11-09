package com.rick.behavioralpatterns.mediator;

/**
 * @author fengrui
 * @date 2022/5/27
 * @description 抽象中介者
 */
public abstract class Mediator {
    public abstract void register(Colleague colleague);

    // 转发
    public abstract void relay(Colleague cl);
}
