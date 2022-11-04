package rick.structuralpatterns.bridge;

/**
 * @author fengrui
 * @date 2022/5/20
 * @description 抽象化角色
 */
public abstract class Abstraction {
    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
