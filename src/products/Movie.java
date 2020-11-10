package products;

public class Movie extends Product {
    public Movie(String title, int releaseDate, int rentalPrice, int retailPrice) {
        super(title, releaseDate, rentalPrice, retailPrice);
        if (releaseDate < 2000) {
            platformType = PlatformType.VHS;
        } else if (releaseDate >= 2000 && releaseDate < 2010) {
            platformType = PlatformType.DVD;
        } else {
            platformType = PlatformType.BLUERAY;
        }
    }

}
