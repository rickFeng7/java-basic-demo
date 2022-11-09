package com.rick.creationalpatterns.factory.simplefactory;

/**
 * @author fengrui
 * @date 2022/5/15
 * @description
 */
public class SimpleFactory {

    public static Product makeProduct(int kind) {
        switch (kind) {
            case 1:
                return new ConcreteProduct1();
            case 2:
                return new ConcreteProduct2();
        }
        return null;
    }
}
