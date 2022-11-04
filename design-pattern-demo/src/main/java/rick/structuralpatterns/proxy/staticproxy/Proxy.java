package rick.structuralpatterns.proxy.staticproxy;

/**
 * @author fengrui
 * @date 2022/5/17
 * @description 代理类
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("访问真实主题之前的预处理...");
    }

    private void postRequest() {
        System.out.println("访问真实主题之后的后续处理...");
    }
}
