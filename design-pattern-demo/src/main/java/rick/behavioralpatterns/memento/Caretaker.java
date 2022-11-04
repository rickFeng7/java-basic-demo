package rick.behavioralpatterns.memento;

/**
 * @author fengrui
 * @date 2022/5/30
 * @description 管理者
 */
public class Caretaker {
    private Memento memento;

    public void setMemento(Memento m) {
        memento = m;
    }

    public Memento getMemento() {
        return memento;
    }
}
