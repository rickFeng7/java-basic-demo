package rick.behavioralpatterns.chainofresponsibility;

/**
 * @author fengrui
 * @date 2022/5/23
 * @description 抽象处理者角色
 */
public abstract class Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    // 处理请求的方法
    public abstract void handleRequest(String request);
}
