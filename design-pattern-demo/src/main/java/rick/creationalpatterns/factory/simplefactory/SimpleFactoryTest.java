package rick.creationalpatterns.factory.simplefactory;

/**
 * @author fengrui
 * @date 2022/5/15
 * @description
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Product product1 = SimpleFactory.makeProduct(1);
        product1.show();
        Product product2 = SimpleFactory.makeProduct(2);
        product2.show();
    }
}
