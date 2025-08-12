package Apartment;

public abstract class Place {
    private final int id;
    private final String name;

    public Place(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract int countApartments();
}

