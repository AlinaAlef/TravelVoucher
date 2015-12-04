package com.epam.travelvoucher.tours;

import com.epam.travelvoucher.traveltour.TravelTour;

/**
 * Created by alef on 09.11.15.
 */
public class Cruise extends TravelTour {
    private String nameOfShip;

    public Cruise() {
        setTransport();
    }

    public void setNameOfShip(String nameOfShip) {
        this.nameOfShip = nameOfShip;
    }

    public String getNameOfShip() {
        return nameOfShip;
    }

    public void setTransport() {
        this.transport = "ship";
    }

    public void printTour() {
        System.out.println("CRUISE");
        System.out.println("Name of tour: " + this.getName());
        System.out.println("It's " + this.getNameOfShip());
        System.out.println("Tour by " + this.getTransport());
        System.out.println(this.getNumberOfMeals() + " number of meals");
        System.out.println(this.getDuringDays() + " days");
        System.out.println(this.getPrice() + "$");
    }
}
