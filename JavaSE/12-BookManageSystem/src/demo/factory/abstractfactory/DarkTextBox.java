package demo.factory.abstractfactory;

public class DarkTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("深色输入框已渲染");
    }
}
