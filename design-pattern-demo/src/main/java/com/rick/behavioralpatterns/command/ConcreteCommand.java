package com.rick.behavioralpatterns.command;

/**
 * @author fengrui
 * @date 2022/5/23
 * @description 具体命令
 */
public class ConcreteCommand extends Command {
    private Receiver receiver;

    ConcreteCommand() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
