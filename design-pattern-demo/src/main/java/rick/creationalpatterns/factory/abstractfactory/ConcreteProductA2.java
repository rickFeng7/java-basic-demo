package rick.creationalpatterns.factory.abstractfactory;

/**
 * @author fengrui
 * @date 2022/5/15
 * @description 具体产品A2：实现抽象产品中的抽象方法
 */
public class ConcreteProductA2 implements Product1 {
    @Override
    public void show() {
        System.out.println("具体产品A2显示...");
    }
}
