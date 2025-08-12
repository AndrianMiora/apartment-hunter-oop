package Apartment;

public class Apartment {
    private final int id;
    private final String title;
    private final String description;
    private final double monthlyRent;
    private final ApartmentStatus status;
    private final Place place;

    public Apartment(int id, String title, String description, double monthlyRent, ApartmentStatus status, Place place) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.monthlyRent = monthlyRent;
        this.status = status;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public ApartmentStatus getStatus() {
        return status;
    }

    public Place getPlace() {
        return place;
    }
}