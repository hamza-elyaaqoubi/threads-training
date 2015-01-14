import com.hel.thread.BankAccount;
import com.hel.thread.BankRunnable;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        
        BankRunnable bankRunnable1 = new BankRunnable(bankAccount1, "T1");
        BankRunnable bankRunnable2 = new BankRunnable(bankAccount1, "T2");
        
        Thread t1 = new Thread(bankRunnable1);
        Thread t2 = new Thread(bankRunnable2);
        
        t1.start();
        t2.start();
    }
}
