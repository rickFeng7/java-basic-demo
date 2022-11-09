package com.rick.behavioralpatterns.iterator;

/**
 * @author fengrui
 * @date 2022/5/27
 * @description 抽象聚合
 */
public interface Aggregate {
    public void add(Object obj);

    public void remove(Object obj);

    public Iterator getIterator();
}
