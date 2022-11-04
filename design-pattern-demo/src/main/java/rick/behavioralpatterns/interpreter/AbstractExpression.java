package rick.behavioralpatterns.interpreter;

/**
 * @author fengrui
 * @date 2022/5/30
 * @description 抽象表达式类
 */
public interface AbstractExpression {
    // 解释方法
    public void interpret(String info);
}
