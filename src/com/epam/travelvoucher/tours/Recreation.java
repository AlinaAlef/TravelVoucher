package com.epam.travelvoucher.tours;

import com.epam.travelvoucher.traveltour.TravelTour;

/**
 * Created by alef on 09.11.15.
 */
public class Recreation extends TravelTour {
    private String isMedical;

    public Recreation() {
        this.setTransport();
    }

    public void setIsMedical(String isMedical) {
        this.isMedical = isMedical;
    }

    public String getIsMedical() {
        return isMedical;
    }

    public void setTransport() {
        this.transport = "train";
    }

    public void printTour() {
        System.out.println("RECREATION");
        System.out.println("Name of tour: " + this.getName());
        System.out.println("It's " + this.getIsMedical());
        System.out.println("Tour by " + this.getTransport());
        System.out.println(this.getNumberOfMeals() + " number of meals");
        System.out.println(this.getDuringDays() + " days");
        System.out.println(this.getPrice() + "$");
    }

}
