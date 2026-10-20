package demo.factory.simplefactory;

public class WechatNotifier implements Notifier {
    @Override
    public void send(String msg) {
        System.out.println("微信：" + msg);
    }
}
