package dev.lpa;

import java.util.ArrayList;

record OrderItem(int qty,ProductForSale productOrdered){}

public class STORE {
    public static ArrayList<ProductForSale> Products=new ArrayList<>();

    public static void main(String[] args) {
        Products.add(new ArtObject("water Color",500,
                "nice for color painting"));
        Products.add(new ArtObject("clay",99,
                "used for making clay stuff"));
        Products.add(new Furniture("chair",200,
                "good for resting"));
        Products.add(new Furniture("Lamp",300,
                "good Light"));
        listProducts();
        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 2, 1);
        addItemToOrder(order1, 1, 0);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 4, 3);
        addItemToOrder(order2, 0, 2);
        addItemToOrder(order2, 1, 0);
        printOrder(order2);

    }
    public static void listProducts() {
        for (var item : Products) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
    public static void addItemToOrder(ArrayList<OrderItem> orderList,int qty,
                                      int orderIndex){
        orderList.add(new OrderItem(qty,Products.get(orderIndex)));
    }
    public static void printOrder(ArrayList<OrderItem> orderList){
        double total=0;
        for(var i:orderList){
            total+=i.productOrdered().getSalePrice(i.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", total);
    }
}
