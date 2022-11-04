package rick.creationalpatterns.prototype;

/**
 * @author fengrui
 * @date 2022/5/16
 * @description 具体原型类
 */
public class RealizeType implements Cloneable {

    public RealizeType() {
        System.out.println("具体原型创建成功！");
    }

    @Override
    public RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (RealizeType) super.clone();
    }
}
