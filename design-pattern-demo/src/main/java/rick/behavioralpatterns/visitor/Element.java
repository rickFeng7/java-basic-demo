package rick.behavioralpatterns.visitor;

/**
 * @author fengrui
 * @date 2022/5/30
 * @description 抽象元素类
 */
public interface Element {
    void accept(Visitor visitor);
}
