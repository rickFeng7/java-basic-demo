package com.rick.structuralpatterns.bridge;

/**
 * @author fengrui
 * @date 2022/5/20
 * @description 扩展抽象化角色
 */
public class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        implementor.operationImpl();
    }
}
