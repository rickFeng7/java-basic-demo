package rick.structuralpatterns.proxy.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * @author fengrui
 * @date 2022/5/17
 * @description
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        proxy(realSubject);
    }

    private static void proxy(RealSubject realSubject) {
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(
                realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),
                (proxy, method, args1) -> {
                    preRequest();
                    Object invoke = method.invoke(realSubject, args1);
                    postRequest();
                    return invoke;
                });
        proxyInstance.request();
    }

    private static void preRequest() {
        System.out.println("访问真实主题之前的预处理...");
    }

    private static void postRequest() {
        System.out.println("访问真实主题之后的后续处理...");
    }
}
