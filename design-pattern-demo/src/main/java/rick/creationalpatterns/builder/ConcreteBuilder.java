package rick.creationalpatterns.builder;

/**
 * @author fengrui
 * @date 2022/5/16
 * @description 具体建造者：实现了抽象建造者接口
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}
