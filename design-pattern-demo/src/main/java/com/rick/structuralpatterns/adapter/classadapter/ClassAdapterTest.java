package com.rick.structuralpatterns.adapter.classadapter;

/**
 * @author fengrui
 * @date 2022/5/19
 * @description
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}
