package Apartment;

import java.util.ArrayList;
import java.util.List;

public class Building extends Place{
    private final int floors;
    private List<Apartment> apartments = new ArrayList<>();

    public Building(int id, String name, int floors, List<Apartment> apartments) {
        super(id, name);
        this.floors = floors;
        this.apartments = apartments;
    }

    public int getFloors() {
        return floors;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void addApartment (Apartment apart) {
        apartments.add(apart);
    }

    @Override
    public int countApartments(){
        return apartments.size();
    }

}
