package store;

import products.Product;
import util.RandomUtil;

import java.util.*;

public class Store {
    List<Product> allProducts = new ArrayList<Product>();
    List<Product> rentedProducts = new ArrayList<Product>();

    private final int CHANCE_OF_RENT = 75;
    private int income;

    public void addProduct(Product product) {
        allProducts.add(product);

    }

    public boolean isRentalDay() {
        RandomUtil random = new RandomUtil();
        return random.calculateChance(CHANCE_OF_RENT);
    }

    public Product chooseProduct(List<Product> products){
        Random random = new Random();
        return products.get(random.nextInt(products.size()));
    }


    public int calculateIncome() {

        for (int i = 0; i < 90; i++) {
            if (isRentalDay() && !allProducts.isEmpty()) {
                Product rentedProduct = chooseProduct(allProducts);
                rentedProduct.calculateRentalDays();
                income += rentedProduct.getRentalDays() * rentedProduct.getRentalPricePerDay();
                allProducts.remove(allProducts.indexOf(rentedProduct));
                rentedProducts.add(rentedProduct);
            }
            Iterator<Product> iterator = rentedProducts.iterator();
            while (iterator.hasNext()) {
                Product next = iterator.next();
                if (next.getRentalDays() > 0) {
                    next.decreaseRentalDays();
                } else {
                    addProduct(next);
                    iterator.remove();
                }
            }
        }
        return income;
    }

    @Override
    public String toString() {
        return "Store{" +
                "products=" + allProducts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return CHANCE_OF_RENT == store.CHANCE_OF_RENT &&
                allProducts.equals(store.allProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allProducts, CHANCE_OF_RENT);
    }
}