package demo.factory.abstractfactory;

public class DarkThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        System.out.println("创建了深色按钮");
        return new DarkButton();
    }

    @Override
    public TextBox createTextBox() {
        System.out.println("创建了深色输入框");
        return new DarkTextBox();
    }
}
