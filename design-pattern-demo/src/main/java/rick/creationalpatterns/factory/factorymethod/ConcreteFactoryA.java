package rick.creationalpatterns.factory.factorymethod;

/**
 * @author fengrui
 * @date 2022/5/15
 * @description 具体工厂A：实现了厂品的生成方法
 */
public class ConcreteFactoryA implements AbstractFactory {

    @Override
    public Product newProduct() {
        System.out.println("具体工厂A生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}
