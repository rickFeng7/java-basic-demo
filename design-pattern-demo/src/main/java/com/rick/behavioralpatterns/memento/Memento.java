package com.rick.behavioralpatterns.memento;

/**
 * @author fengrui
 * @date 2022/5/30
 * @description 备忘录
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
