package rick.creationalpatterns.factory.factorymethod;

/**
 * @author fengrui
 * @date 2022/5/15
 * @description
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        Product product1 = new ConcreteFactoryA().newProduct();
        product1.show();
        Product product2 = new ConcreteFactoryB().newProduct();
        product2.show();
    }
}
