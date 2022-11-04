package rick.behavioralpatterns.command;

/**
 * @author fengrui
 * @date 2022/5/23
 * @description
 */
public class CommandTest {
    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();
        Invoker ir = new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();
    }
}
