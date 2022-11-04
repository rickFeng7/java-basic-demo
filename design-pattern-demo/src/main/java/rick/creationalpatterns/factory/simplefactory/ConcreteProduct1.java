package rick.creationalpatterns.factory.simplefactory;

/**
 * @author fengrui
 * @date 2022/5/15
 * @description 具体产品：Product1
 */
public class ConcreteProduct1 implements Product {

    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}
