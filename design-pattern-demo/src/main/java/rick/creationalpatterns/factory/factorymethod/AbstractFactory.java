package rick.creationalpatterns.factory.factorymethod;

/**
 * @author fengrui
 * @date 2022/5/15
 * @description 抽象工厂：提供了厂品的生成方法
 */
public interface AbstractFactory {

    public Product newProduct();
}
