package demo.factory.factorymethod;

public class SmsNotifier implements Notifier {
    @Override
    public void send(String msg) {
        System.out.println("短信：" + msg);
    }
}
