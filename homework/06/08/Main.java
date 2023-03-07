public class Main {
    public static void main(String [] args) {
        for (String n : args) {
            int number = Integer.parseInt(n);
            Thread thread = new Thread(new Runnable () {
                public void run() {
                    for (int i = 0; i < number; i++) {
                        System.out.println(Thread.currentThread().getName() + ": " + (i + 1));
                        try {
                            Thread.sleep(500);
                        } catch(InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }); 
            thread.start();
        }      
    }
}
