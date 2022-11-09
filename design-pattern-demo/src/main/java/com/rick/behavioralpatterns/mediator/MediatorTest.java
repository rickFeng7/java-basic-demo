package com.rick.behavioralpatterns.mediator;

/**
 * @author fengrui
 * @date 2022/5/27
 * @description
 */
public class MediatorTest {
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
