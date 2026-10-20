package demo.factory.factorymethod;

public class Main {
    public static void main(String[] args) {
        Notifier notifier1 = new SmsNotifierFactory().create();
        notifier1.send("111");

        Notifier notifier2 = new EmailNotifierFactory().create();
        notifier2.send("222");

        Notifier notifier3 = new WechatNotifierFactory().create();
        notifier3.send("333");
    }
}
