package com.rick.creationalpatterns.singleton;

/**
 * @author fengrui
 * @date 2022/5/9
 * @description 饿汉式
 */
public class HungrySingleton {

    private HungrySingleton() {
    }

    // 1.静态成员变量
    private static final HungrySingleton instance = new HungrySingleton();

    public HungrySingleton getInstance() {
        return instance;
    }

    // 2.静态代码块
    private static final HungrySingleton instance1;

    static {
        instance1 = new HungrySingleton();
    }

    public HungrySingleton getInstance1() {
        return instance1;
    }

    // 3.枚举
    public enum Singleton {
        INSTANCE;
    }
}
