package rick.behavioralpatterns.visitor;

/**
 * @author fengrui
 * @date 2022/5/30
 * @description 抽象访问者
 */
public interface Visitor {
    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}
