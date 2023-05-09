package vjezbe.vjezbe5b;

public abstract class Item5b {

    protected int quantity;
    protected float itemPrice;
    protected String itemDescription;
    protected int itemID;
    protected static int cntID = 1;
    protected float totalPrice;

    public Item5b(int quantity, String itemDescription) {
        this.quantity = quantity;
        this.itemDescription = itemDescription;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " ->" +
                itemDescription + "\nQUANTITY: " + quantity + "\nTOTAL PRICE: " +
                totalPrice + "$\nID: " + itemID;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void calculateTotalPrice(){
        totalPrice = quantity*itemPrice;
    }
}
