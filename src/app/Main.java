package app;

import products.*;
import store.Store;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Product product1 = new Movie("Tarzan",1990, 3, 10);
        Product product2 = new Movie("Tarzan",2000, 4, 15);
        Product product3 = new Movie("Tarzan",2020, 5, 20);
        Product product4 = new Music("AC/DC",1990, 2, 20);
        Product product5 = new TvShow("Barátok közt",1999, 1, 20);
        Product product6 = new VideoGame("Fall out 3",2010, 7, 20);
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);
        store.addProduct(product5);
        store.addProduct(product6);
        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(store);
        System.out.println("The store earned $" + store.calculateIncome() + " in the last 3 month.");
    }
}
