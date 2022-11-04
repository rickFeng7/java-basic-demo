package rick.structuralpatterns.bridge;

/**
 * @author fengrui
 * @date 2022/5/20
 * @description
 */
public class BridgeTest {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementor();
        Abstraction abs = new RefinedAbstraction(implementor);
        abs.operation();
    }
}
