public class SoftDrink extends Thing implements SellableItem {
    
    public SoftDrink(String name) {
        super(name);
    }

    public void sell() {
        System.out.println(getName() + " has been sold");
    }
}
