package com.rick.structuralpatterns.composite;

/**
 * @author fengrui
 * @date 2022/5/20
 * @description 抽象构件
 */
public interface Component {
    public void add(Component c);

    public void remove(Component c);

    public Component getChild(int i);

    public void operation();
}
