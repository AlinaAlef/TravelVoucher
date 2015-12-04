package com.epam.travelvoucher.tours;

import com.epam.travelvoucher.traveltour.TravelTour;

/**
 * Created by alef on 09.11.15.
 */
public class Shopping extends TravelTour {
    private int numberOfShops;

    public Shopping() {
        setTransport();
    }

    public void setNumberOfShops(int numberOfShops) {
        this.numberOfShops = numberOfShops;
    }

    public int getNumberOfShops() {
        return numberOfShops;
    }

    public void setTransport() {
        this.transport = "plane";
    }

    public void printTour() {
        System.out.println("SHOPPING");
        System.out.println("Name of tour: " + this.getName());
        System.out.println("Number of shops " + this.getNumberOfShops());
        System.out.println("Tour by " + this.getTransport());
        System.out.println(this.getNumberOfMeals() + " number of meals");
        System.out.println(this.getDuringDays() + " days");
        System.out.println(this.getPrice() + "$");
    }
}
