package com.rick.structuralpatterns.adapter.classadapter;

/**
 * @author fengrui
 * @date 2022/5/19
 * @description 类适配器类，继承适配者类，实现目标接口
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
