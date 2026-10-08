package example;

abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // 抽象方法：子类必须实现
    public abstract void pay();
}

class AlipayPayment extends Payment {
    public AlipayPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("支付宝支付：" + amount + "元");
        // 调用支付宝SDK...
    }

    public void returnMoney() {
        System.out.println("支付宝红包返现： " + amount / 100 + "元");
    }
}

class WeChatPayment extends Payment {
    public WeChatPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("微信支付：" + amount + "元");
        // 调用微信支付SDK...
    }
}

class BankCardPayment extends Payment {
    private String cardNumber;

    public BankCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay() {
        System.out.println("银行卡支付：" + amount + "元，卡号：" + cardNumber);
        // 调用银行接口...
    }
}