package demo.factory.factorymethod;

public class SmsNotifierFactory implements NotifierFactory {
    @Override
    public Notifier create() {
        return new SmsNotifier();
    }
}
