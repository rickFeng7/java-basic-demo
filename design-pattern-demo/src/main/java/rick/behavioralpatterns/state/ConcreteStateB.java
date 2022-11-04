package rick.behavioralpatterns.state;

/**
 * @author fengrui
 * @date 2022/5/23
 * @description 具体状态B类
 */
public class ConcreteStateB extends State{
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}
