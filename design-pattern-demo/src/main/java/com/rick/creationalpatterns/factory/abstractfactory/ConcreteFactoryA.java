package com.rick.creationalpatterns.factory.abstractfactory;

/**
 * @author fengrui
 * @date 2022/5/15
 * @description 具体工厂B：实现了产品的生成方法
 */
public class ConcreteFactoryA implements AbstractFactory {

    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂A生成-->具体产品A1...");
        return new ConcreteProductA1();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂A生成-->具体产品B1...");
        return new ConcreteProductB1();
    }
}
