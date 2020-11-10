package products;

public class Music extends Product {
    public Music(String title, int releaseDate, int rentalPrice, int retailPrice) {
        super(title, releaseDate, rentalPrice, retailPrice);
        platformType = PlatformType.CD;
    }
}
