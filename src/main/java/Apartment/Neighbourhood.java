package Apartment;

import java.util.ArrayList;
import java.util.List;

public class Neighbourhood extends Place{
    private final List<Building> buildings = new ArrayList<>();
    private final List<Apartment> apartments = new ArrayList<>();

    public Neighbourhood(int id, String name) {
        super(id, name);
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public boolean containsApartment(Apartment apartment) {
        if (apartments.contains(apartment)) return true;
        for (Building building : buildings) {
            if (building.getApartments().contains(apartment)) return true;
        }
        return false;
    }

    @Override
    public int countApartments() {
        int total = apartments.size();
        for (Building building : buildings) {
            total += building.countApartments();
        }
        return total;
    }
}
