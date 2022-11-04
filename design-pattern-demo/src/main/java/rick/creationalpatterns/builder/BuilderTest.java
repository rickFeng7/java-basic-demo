package rick.creationalpatterns.builder;

/**
 * @author fengrui
 * @date 2022/5/16
 * @description
 */
public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
