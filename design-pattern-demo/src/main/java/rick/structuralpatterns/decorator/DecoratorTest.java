package rick.structuralpatterns.decorator;

/**
 * @author fengrui
 * @date 2022/5/19
 * @description
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}
