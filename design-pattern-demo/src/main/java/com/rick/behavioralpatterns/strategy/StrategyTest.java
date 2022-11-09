package com.rick.behavioralpatterns.strategy;

/**
 * @author fengrui
 * @date 2022/5/22
 * @description
 */
public class StrategyTest {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
