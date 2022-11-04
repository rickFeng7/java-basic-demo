package rick.creationalpatterns.factory.abstractfactory;

/**
 * @author fengrui
 * @date 2022/5/15
 * @description 具体产品B2：实现抽象产品中的抽象方法
 */
public class ConcreteProductB2 implements Product2 {
    @Override
    public void show() {
        System.out.println("具体产品B2显示...");
    }
}
