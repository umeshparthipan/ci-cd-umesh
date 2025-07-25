import java.util.Scanner;
public class PrintNumbersInSequence {
    private int n;
    private int current = 1;
    public PrintNumbersInSequence(int n) {
        this.n = n;
        Runnable task = () -> {
            while (true) {
                synchronized (this) {
                    if (current > n) {
                        break;
                    }
                    System.out.print(current + " ");
                    current++;
                }
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        new PrintNumbersInSequence(n);
    }
}
