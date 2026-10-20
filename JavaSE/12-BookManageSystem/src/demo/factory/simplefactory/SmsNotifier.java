package demo.factory.simplefactory;

public class SmsNotifier implements Notifier {
    @Override
    public void send(String msg) {
        System.out.println("短信：" + msg);
    }
}
