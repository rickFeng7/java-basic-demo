package rick.behavioralpatterns.observer;


/**
 * @author fengrui
 * @date 2022/5/23
 * @description 具体目标
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");
        for (Observer obs : observers) {
            obs.response();
        }
    }
}
