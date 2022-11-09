package com.rick.structuralpatterns.adapter.objectadapter;

/**
 * @author fengrui
 * @date 2022/5/19
 * @description 对象适配器类
 */
public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
