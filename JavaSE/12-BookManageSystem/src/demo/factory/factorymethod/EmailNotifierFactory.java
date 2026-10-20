package demo.factory.factorymethod;

public class EmailNotifierFactory implements NotifierFactory {
    @Override
    public Notifier create() {
        return new EmailNotifier();
    }
}
