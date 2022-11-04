package rick.creationalpatterns.singleton;

/**
 * @author fengrui
 * @date 2022/4/19
 * @description 懒汉式
 */
public class LazySingleton {

    private LazySingleton() {
    }

    public static LazySingleton instance;

    // 1.锁方法，性能低
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    // volatile 解决多线程下因cpu指令重排导致的空指针问题
    public static volatile LazySingleton instance1;

    // 2.双重检查锁
    public static LazySingleton getInstance1() {
        if (instance1 == null) {
            synchronized (LazySingleton.class) {
                if (instance1 == null) {
                    instance1 = new LazySingleton();
                }
            }
        }
        return instance1;
    }

    // 3.静态内部类
    private static class SingletonHolder {
        private static final LazySingleton INSTANCE2 = new LazySingleton();
    }

    public static LazySingleton getInstance2() {
        return SingletonHolder.INSTANCE2;
    }
}
