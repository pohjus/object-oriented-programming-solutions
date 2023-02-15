public class Main {
    public static void main(String [] args) {
        Store store = new Store("RandomStore");
        SoftDrink cocacola = new SoftDrink("CocaCola");
        Dog d = new Dog("Spot");
        Bird b = new Bird("Birdo");
        store.addSellableItem(cocacola);
        store.addSellableItem(d);
        store.addSellableItem(b);
        for (int i = 0; i < store.getInventorySize(); i++) {
            System.out.println(store.getSellableItem(i));
        }
        store.removeSellableItem(b);
        store.sellAllItems();
    }
}