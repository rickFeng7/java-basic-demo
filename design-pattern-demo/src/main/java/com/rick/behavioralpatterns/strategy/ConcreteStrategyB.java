package com.rick.behavioralpatterns.strategy;

/**
 * @author fengrui
 * @date 2022/5/22
 * @description 具体策略类B
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
