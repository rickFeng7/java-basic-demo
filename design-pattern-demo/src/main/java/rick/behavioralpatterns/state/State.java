package rick.behavioralpatterns.state;

/**
 * @author fengrui
 * @date 2022/5/23
 * @description 抽象状态类
 */
public abstract class State {
    public abstract void Handle(Context context);
}
