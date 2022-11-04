package rick.structuralpatterns.decorator;

/**
 * @author fengrui
 * @date 2022/5/19
 * @description 抽象装饰角色，实现+聚合 抽象构件角色
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
