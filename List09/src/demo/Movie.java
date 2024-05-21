package demo;

public class Movie {
    private String title;
    private String releaseDate;
    private String cast;
    private String posterColor;
    private double ticketPrice;
    private boolean hasMirtilo;
    private int duration;

    public Movie(String title, String releaseDate, String cast, String posterColor, double ticketPrice, boolean hasMirtilo, int duration) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.cast = cast;
        this.posterColor = posterColor;
        this.ticketPrice = ticketPrice;
        this.hasMirtilo = hasMirtilo;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getPosterColor() {
        return posterColor;
    }

    public void setPosterColor(String posterColor) {
        this.posterColor = posterColor;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public boolean getHasMirtilo() {
        return hasMirtilo;
    }

    public void setHasMirtilo(boolean hasMirtilo) {
        this.hasMirtilo = hasMirtilo;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
