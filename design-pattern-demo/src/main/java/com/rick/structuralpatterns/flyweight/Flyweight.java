package com.rick.structuralpatterns.flyweight;

/**
 * @author fengrui
 * @date 2022/5/22
 * @description 抽象享元角色
 */
public interface Flyweight {
    public void operation(UnsharedConcreteFlyweight state);
}
