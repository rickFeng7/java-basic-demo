package rick.behavioralpatterns.templatemethod;

/**
 * @author fengrui
 * @date 2022/5/22
 * @description
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.templateMethod();
    }
}
