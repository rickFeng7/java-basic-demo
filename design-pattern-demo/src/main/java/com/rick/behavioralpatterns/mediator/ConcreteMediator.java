package com.rick.behavioralpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengrui
 * @date 2022/5/27
 * @description 具体中介者
 */
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(Colleague cl) {
        for (Colleague ob : colleagues) {
            if (!ob.equals(cl)) {
                ob.receive();
            }
        }
    }
}
