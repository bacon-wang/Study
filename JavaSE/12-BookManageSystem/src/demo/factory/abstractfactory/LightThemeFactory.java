package demo.factory.abstractfactory;

public class LightThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        System.out.println("创建了浅色按钮");
        return new LightButton();
    }

    @Override
    public TextBox createTextBox() {
        System.out.println("创建了浅色输入框");
        return new LightTextBox();
    }

}
