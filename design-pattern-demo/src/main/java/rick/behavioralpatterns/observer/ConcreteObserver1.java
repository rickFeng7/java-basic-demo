package rick.behavioralpatterns.observer;

/**
 * @author fengrui
 * @date 2022/5/23
 * @description 具体观察者1
 */
public class ConcreteObserver1 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}
