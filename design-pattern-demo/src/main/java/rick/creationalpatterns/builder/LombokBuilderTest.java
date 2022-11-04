package rick.creationalpatterns.builder;

/**
 * @author fengrui
 * @date 2022/5/16
 * @description
 */
public class LombokBuilderTest {
    public static void main(String[] args) {
        LombokBuilder lombokBuilder = LombokBuilder.builder()
                .partA("partA")
                .partB("partB")
                .partC("partC")
                .build();
        System.out.println(lombokBuilder);
    }
}
