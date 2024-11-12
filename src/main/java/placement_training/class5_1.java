package placement_training;

class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) { //synchronized : one thread at a time!! keeps the methods , avoids deadlock,
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". New balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " failed to withdraw " + amount + ". Insufficient balance.");
        }
    }
}

class BankingThread extends Thread {
    private BankAccount account;
    private boolean isDeposit;
    private int amount;

    public BankingThread(BankAccount account, boolean isDeposit, int amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

public class class5_1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new BankingThread(account, true, 100);  // Deposit
        Thread t2 = new BankingThread(account, false, 50);  // Withdraw
        Thread t3 = new BankingThread(account, true, 200);  // Deposit
        Thread t4 = new BankingThread(account, false, 150); // Withdraw

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();// to prevent deadlock to threads!!
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
