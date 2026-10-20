package demo.factory.abstractfactory;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("浅色按钮已渲染");
    }
}
