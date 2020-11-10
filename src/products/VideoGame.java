package products;

public class VideoGame extends Product {
    public VideoGame(String title, int releaseDate, int rentalPrice, int retailPrice) {
        super(title, releaseDate, rentalPrice, retailPrice);
        platformType = PlatformType.DVD;
    }
}
