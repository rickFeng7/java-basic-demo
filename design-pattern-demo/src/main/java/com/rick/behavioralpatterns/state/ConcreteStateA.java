package com.rick.behavioralpatterns.state;

/**
 * @author fengrui
 * @date 2022/5/23
 * @description 具体状态A类
 */
public class ConcreteStateA extends State{
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
