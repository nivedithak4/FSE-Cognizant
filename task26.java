class Message extends Thread {
    String msg;
    Message(String msg) {
        this.msg = msg;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(msg + " - " + i);
        }
    }
}
public class task26 {
    public static void main(String[] args) {
        Message t1 = new Message("Thread 1 ");
        Message t2 = new Message("Thread 2 ");
        t1.start();
        t2.start();
    }
}