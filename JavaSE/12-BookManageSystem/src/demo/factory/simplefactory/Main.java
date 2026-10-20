package demo.factory.simplefactory;

public class Main {
    public static void main(String[] args) {
        try {
            Notifier notifier1 = NotifierFactory.create("sms");
            notifier1.send("111");

            Notifier notifier2 = NotifierFactory.create("email");
            notifier2.send("222");

            Notifier notifier3 = NotifierFactory.create("wechat");
            notifier3.send("333");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
