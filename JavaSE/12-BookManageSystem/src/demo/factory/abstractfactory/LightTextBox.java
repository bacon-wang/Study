package demo.factory.abstractfactory;

public class LightTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("浅色输入框已渲染");
    }
}
