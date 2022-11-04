package rick.structuralpatterns.proxy.staticproxy;

/**
 * @author fengrui
 * @date 2022/5/17
 * @description 真实主题
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}
