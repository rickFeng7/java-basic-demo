package com.rick.behavioralpatterns.strategy;

/**
 * @author fengrui
 * @date 2022/5/22
 * @description 环境类
 */
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
