public class TT extends Thread {
    public void run() {
        System.out.println("thread run.");
    }

    public static void main(String[] args) {
        Test test = new Test();
        //test.start();
    }
}
