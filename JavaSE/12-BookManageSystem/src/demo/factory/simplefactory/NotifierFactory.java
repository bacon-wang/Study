package demo.factory.simplefactory;

class NotifierFactory {
    public static Notifier create(String type) throws Exception {
        if (type.equals("sms")) {
            return new SmsNotifier();
        } else if (type.equals("email")) {
            return new EmailNotifier();
        } else if (type.equals("wechat")) {
            return new WechatNotifier();
        }

        throw new Exception("type not found");
    }
}
