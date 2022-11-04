package rick.structuralpatterns.bridge;

/**
 * @author fengrui
 * @date 2022/5/20
 * @description 具体实现化角色
 */
public class ConcreteImplementor implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}
