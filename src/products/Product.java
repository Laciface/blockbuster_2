package products;

import util.RandomUtil;

public abstract class Product {
    protected final int MIN_RENTAL_DAYS = 3;
    protected final int MAX_RENTAL_DAYS = 14;

    private String title;
    private int releaseDate;
    private int rentalPricePerDay;
    private int retailPrice;
    protected PlatformType platformType;
    protected int rentalDays;

    public int getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void decreaseRentalDays() {
        this.rentalDays -= 1;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public Product(String title, int releaseDate, int rentalPrice, int retailPrice) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.rentalPricePerDay = rentalPrice;
        this.retailPrice = retailPrice;
    }

    public void calculateRentalDays() {
        RandomUtil random = new RandomUtil();
        rentalDays = random.calculateDays(MIN_RENTAL_DAYS, MAX_RENTAL_DAYS);
    }


    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", rentalPrice=" + rentalPricePerDay +
                ", retailPrice=" + retailPrice +
                ", platformType=" + platformType +
                '}';
    }
}
