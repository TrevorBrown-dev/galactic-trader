public class CreditAccount {
    private int credits;

    public CreditAccount(int credits) {
        this.credits = credits;
    }

    public CreditAccount() {
        this(0);
    }

    public void addCredits(int amount) {
        this.credits += amount;
    }

    public void removeCredits(int amount) {
        this.credits -= amount;
    }

    public int getCredits() {
        return this.credits;
    }
}
