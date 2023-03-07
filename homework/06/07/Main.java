public class Main {
    public static void main(String [] args) {
        // MyRunnable r = new MyRunnable();
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + 1);
                    try {
                        Thread.sleep(500);
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };        
        Thread thread1 = new Thread(r);
        thread1.start();
        Thread thread2 = new Thread(r);
        thread2.start();
    }
}
