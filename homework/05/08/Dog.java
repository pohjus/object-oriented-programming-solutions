public class Dog extends Thing implements SellableItem {

    public Dog(String name) {
        super(name);
    }

    public void sell() {
        System.out.println(getName() + " has been sold");
    }
}
