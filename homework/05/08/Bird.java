public class Bird extends Thing implements SellableItem {

    public Bird(String name) {
        super(name);
    }
    
    public void sell() {
        System.out.println(getName() + " has been sold");
    }
}
