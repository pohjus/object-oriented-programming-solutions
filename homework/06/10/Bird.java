public class Bird implements Flyable {
    public void fly(int speed) {
        if (speed > 0) {
            System.out.println("flying forwards");
        } else {
            System.out.println("flying backwards");
        }
    }    
}
