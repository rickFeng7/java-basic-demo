package rick.creationalpatterns.factory.abstractfactory;

/**
 * @author fengrui
 * @date 2022/5/15
 * @description
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        Product1 product11 = new ConcreteFactoryA().newProduct1();
        product11.show();
        Product2 product21 = new ConcreteFactoryA().newProduct2();
        product21.show();

        Product1 product12 = new ConcreteFactoryB().newProduct1();
        product12.show();
        Product2 product22 = new ConcreteFactoryB().newProduct2();
        product22.show();
    }
}
