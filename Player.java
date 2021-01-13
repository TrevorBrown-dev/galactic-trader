public class Player {
    private String name;
    private CreditAccount account;
    private Inventory inventory;

    public Player(String name, CreditAccount account, Inventory inventory) {
        this.name = name;
        this.account = account;
        this.inventory = inventory;
    }

    public Player(String name) {
        this(name, new CreditAccount(), new Inventory());
    }

    public String getName() {
        return name;
    }

    public CreditAccount getAccount() {
        return account;
    }

    public Inventory getInventory() {
        return inventory;
    }

}
