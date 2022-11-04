package rick.creationalpatterns.factory.factorymethod;

/**
 * @author fengrui
 * @date 2022/5/15
 * @description 具体产品2：实现抽象产品中的抽象方法
 */
public class ConcreteProduct2 implements Product {

    @Override
    public void show() {
        System.out.println("具体产品2显示...");
    }
}
