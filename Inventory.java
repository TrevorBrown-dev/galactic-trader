import java.util.Hashtable;

public class Inventory {
    private Hashtable<String, Integer> inventory = new Hashtable<>();

    public Inventory(Hashtable<String, Integer> inventory) {
        this.inventory = inventory;
    }

    public Inventory() {
        this(new Hashtable<String, Integer>());
    }

    public void addItem(String item) {
        addItem(item, 1);
    }

    public void addItem(String item, int amount) {
        int newAmount = 0;
        Integer inventoryAmount = inventory.get(item);
        if (inventoryAmount != null) {
            newAmount = inventory.get(item);
        }

        inventory.put(item, newAmount + amount);
    }
}
