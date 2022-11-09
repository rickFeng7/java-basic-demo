package com.rick.behavioralpatterns.iterator;

/**
 * @author fengrui
 * @date 2022/5/27
 * @description 抽象迭代器
 */
public interface Iterator {
    Object first();

    Object next();

    boolean hasNext();
}
