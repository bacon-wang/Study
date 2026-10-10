package practice;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    class Transaction {
        String type;
        double amount;

        public Transaction(String type, double amount) {
            if (type.equals("存款")) {
                BankAccount.this.balance += amount;
            } else if (type.equals("取款")) {
                BankAccount.this.balance -= amount;
            } else {
                System.out.println("交易类型错误！");
                return;
            }

            this.type = type;
            this.amount = amount;
        }

        void print() {
            System.out.printf("[%s] %f 元，余额%f\n", type, amount, balance);
        }
    }

    void record(String type, double amount) {
        Transaction transaction = new Transaction(type, amount);
        transaction.print();
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1882.34);
        acc.new Transaction("存款", 100).print();
        acc.record("取款", 50);
    }
}
