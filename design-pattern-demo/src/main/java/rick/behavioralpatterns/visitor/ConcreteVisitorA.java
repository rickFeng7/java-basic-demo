package rick.behavioralpatterns.visitor;

/**
 * @author fengrui
 * @date 2022/5/30
 * @description 具体访问者A类
 */
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者A访问-->" + element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者A访问-->" + element.operationB());
    }
}
