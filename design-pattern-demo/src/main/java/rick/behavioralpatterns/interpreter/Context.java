package rick.behavioralpatterns.interpreter;

/**
 * @author fengrui
 * @date 2022/5/30
 * @description 环境类
 */
public class Context {
    private AbstractExpression exp;

    public Context() {
        //数据初始化
    }

    public void operation(String info) {
        //调用相关表达式类的解释方法
    }
}
