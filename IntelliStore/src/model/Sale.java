package model;

public class Sale {
    private int id;
    private String itemName;
    private int quantity;
    private double totalPrice;

    public Sale(int id, String itemName, int quantity, double totalPrice) {
        this.id = id;
        this.itemName = itemName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }
}
