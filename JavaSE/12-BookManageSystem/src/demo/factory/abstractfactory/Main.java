package demo.factory.abstractfactory;

public class Main {
    public static void main(String[] args) {
        ThemeFactory themeFactory = new LightThemeFactory();

        Button button1 = themeFactory.createButton();
        button1.render();
        TextBox textBox1 = themeFactory.createTextBox();
        textBox1.render();


        themeFactory = new DarkThemeFactory();

        Button button2 = themeFactory.createButton();
        button2.render();
        TextBox textBox2 = themeFactory.createTextBox();
        textBox2.render();

    }
}
