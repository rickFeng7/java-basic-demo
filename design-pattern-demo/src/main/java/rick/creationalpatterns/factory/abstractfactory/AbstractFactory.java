package rick.creationalpatterns.factory.abstractfactory;

/**
 * @author fengrui
 * @date 2022/5/15
 * @description 抽象工厂：提供了产品的生成方法
 */
public interface AbstractFactory {

    public Product1 newProduct1();

    public Product2 newProduct2();
}
