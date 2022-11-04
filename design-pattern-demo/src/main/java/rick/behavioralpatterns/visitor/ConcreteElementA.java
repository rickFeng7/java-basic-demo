package rick.behavioralpatterns.visitor;

/**
 * @author fengrui
 * @date 2022/5/30
 * @description 具体元素A类
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "具体元素A的操作。";
    }
}
