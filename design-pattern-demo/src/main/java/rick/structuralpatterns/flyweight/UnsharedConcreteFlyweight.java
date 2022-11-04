package rick.structuralpatterns.flyweight;

/**
 * @author fengrui
 * @date 2022/5/22
 * @description 非享元角色
 */
public class UnsharedConcreteFlyweight {
    private String info;

    UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
