package demo.factory.factorymethod;

public class WechatNotifierFactory implements NotifierFactory {
    @Override
    public Notifier create() {
        return new WechatNotifier();
    }
}
