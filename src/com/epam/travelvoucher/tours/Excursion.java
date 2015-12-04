package com.epam.travelvoucher.tours;

import com.epam.travelvoucher.traveltour.TravelTour;

/**
 * Created by alef on 09.11.15.
 */
public class Excursion extends TravelTour {

    public Excursion() {
        setTransport();
    }

    private int numberOfExcursions;

    public void setNumberOfExcursions(int numberOfExcursions) {
        this.numberOfExcursions = numberOfExcursions;
    }

    public int getNumberOfExcursions() {
        return numberOfExcursions;
    }

    public void setTransport() {
        this.transport = "bus";
    }

    public void printTour() {
        System.out.println("EXCURSION");
        System.out.println("Name of tour: " + this.getName());
        System.out.println("Number of excursions " + this.getNumberOfExcursions());
        System.out.println("Tour by " + this.getTransport());
        System.out.println(this.getNumberOfMeals() + " number of meals");
        System.out.println(this.getDuringDays() + " days");
        System.out.println(this.getPrice() + "$");
    }
}

