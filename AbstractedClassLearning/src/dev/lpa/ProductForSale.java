package dev.lpa;

public abstract class ProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public final double getSalePrice(int quantity){
        return price*quantity;
    }
    public final void getPricedItem(int quantity){

        System.out.printf("%2d qty at %8.2f each, %-15s %-35s %n",
                quantity,price, type,description);

    }
    public abstract void showDetails();
}
