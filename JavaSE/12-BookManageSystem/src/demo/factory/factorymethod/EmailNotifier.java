package demo.factory.factorymethod;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String msg) {
        System.out.println("邮件：" + msg);
    }
}
