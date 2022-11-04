package rick.behavioralpatterns.mediator;

/**
 * @author fengrui
 * @date 2022/5/27
 * @description 抽象同事类
 */
public abstract class Colleague {
    protected Mediator mediator;

    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
