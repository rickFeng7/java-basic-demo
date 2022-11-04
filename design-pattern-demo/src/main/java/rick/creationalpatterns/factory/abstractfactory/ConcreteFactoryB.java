package rick.creationalpatterns.factory.abstractfactory;

/**
 * @author fengrui
 * @date 2022/5/15
 * @description 具体工厂B：实现了产品的生成方法
 */
public class ConcreteFactoryB implements AbstractFactory {

    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂B生成-->具体产品A2...");
        return new ConcreteProductA2();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂B生成-->具体产品B2...");
        return new ConcreteProductB2();
    }
}
