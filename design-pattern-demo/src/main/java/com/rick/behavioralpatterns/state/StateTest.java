package com.rick.behavioralpatterns.state;

/**
 * @author fengrui
 * @date 2022/5/23
 * @description
 */
public class StateTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.Handle();
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
