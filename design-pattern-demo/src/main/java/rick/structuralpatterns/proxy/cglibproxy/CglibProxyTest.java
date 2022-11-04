package rick.structuralpatterns.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author fengrui
 * @date 2022/5/17
 * @description
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        // 保存生成之后的动态代理类
        // System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\Develop\\IdeaProjects\\myCode\\DesignPattern");
        // 1.创建动态代理增强类，类似JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 2.设置类加载器
        enhancer.setSuperclass(RealSubject.class);
        // 3.设置回调函数
        enhancer.setCallback(new ProxySubject());
        // 4.创建代理对象
        RealSubject realSubject = (RealSubject) enhancer.create();
        realSubject.request();
    }
}
