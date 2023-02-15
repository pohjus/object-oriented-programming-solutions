import java.util.ArrayList;

public class Store {
    private String name;
    ArrayList<SellableItem> inventory;

    public Store(String name) {
        setName(name);
        this.inventory = new ArrayList<SellableItem>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getInventorySize() {
        return inventory.size();
    }
    
    public void addSellableItem(SellableItem si) {
        inventory.add(si);
        System.out.println(si + " has been added to " + getName());
    }

    public void removeSellableItem(SellableItem si) {
        inventory.remove(si);
        System.out.println(si + " has been removed");
    }

    public SellableItem getSellableItem(int i) {
        return inventory.get(i);
    }

    public void sellAllItems() {
        inventory.forEach(item -> {
            item.sell();
        });
    }
}
