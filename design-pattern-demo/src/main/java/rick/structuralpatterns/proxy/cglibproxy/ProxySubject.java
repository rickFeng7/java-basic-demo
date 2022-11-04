package rick.structuralpatterns.proxy.cglibproxy;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author fengrui
 * @date 2022/5/17
 * @description 方法拦截类
 */
public class ProxySubject implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("访问真实主题之前的预处理...");
        Object returnValue = methodProxy.invokeSuper(o, objects);
        System.out.println("访问真实主题之后的后续处理...");
        return returnValue;
    }
}
