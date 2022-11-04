package rick.creationalpatterns.factory.factorymethod;

/**
 * @author fengrui
 * @date 2022/5/15
 * @description 具体工厂B：实现了厂品的生成方法
 */
public class ConcreteFactoryB implements AbstractFactory {

    @Override
    public Product newProduct() {
        System.out.println("具体工厂B生成-->具体产品2...");
        return new ConcreteProduct2();
    }
}
