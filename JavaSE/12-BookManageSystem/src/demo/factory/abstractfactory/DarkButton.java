package demo.factory.abstractfactory;

public class DarkButton implements Button{
    @Override
    public void render() {
        System.out.println("深色按钮已渲染");
    }
}
