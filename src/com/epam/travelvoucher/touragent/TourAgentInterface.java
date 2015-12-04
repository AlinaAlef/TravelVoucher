package com.epam.travelvoucher.touragent;

import com.epam.travelvoucher.traveltour.TravelTour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * The class {@code TourAgentInterface}
 * presents interface of order
 */
public class TourAgentInterface {
    ArrayList<TravelTour> travelTours;

    public TourAgentInterface(ArrayList<TravelTour> travelTours) {
        this.travelTours = travelTours;
    }

    /*
     *interface of order of type of tour
     *
     *@return  number of type of tour
    */
    int orderKindOfTour() {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose kind of tour:");
        System.out.println("1. Cruise");
        System.out.println("2. Excursion");
        System.out.println("3. Recreation");
        System.out.println("4. Shopping");
        int kindTour = in.nextInt();
        return kindTour;
    }

    /*
     *interface of order of type of transport
     *
     *@return  number of type of transport
    */
    int orderTransport() {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose kind of transport:");
        System.out.println("1. Train");
        System.out.println("2. Bus");
        System.out.println("3. Plane");
        System.out.println("4. Car");
        int kindTransport = in.nextInt();
        return kindTransport;
    }

    /*
     *interface of order of number of meals
     *
     *@return  number of meals
    */
    int orderNumMeals() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of meals:");
        int numMeals = in.nextInt();
        return numMeals;
    }

    /*
     *interface of order of type of tour
     *
     *@return  number of type of tour
    */
    int orderNumDays() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of days:");
        int numDays = in.nextInt();
        return numDays;
    }

    /*
     *print sorted variant of list of tours
    */
    public void printSortedVariants() {
        if (travelTours.size() == 0) {
            System.out.println("Sorry! Haven't any offer");
        }
        Collections.sort(travelTours, TravelTour.TravelTourComparator);
        System.out.println("Tours sorted by price");
        for (int numberOfTour = 0; numberOfTour < travelTours.size(); numberOfTour++) {
            System.out.println();
            System.out.println("Variant #" + (numberOfTour + 1));
            travelTours.get(numberOfTour).printTour();
        }
        System.out.println();
    }

    /*
     *print your order
    */
    public void printOrder() {
        Scanner scan = new Scanner(System.in);
        int vestigialVariant = scan.nextInt();

        System.out.println("YOUR ORDER");
        travelTours.get(vestigialVariant - 1).printTour();
    }

    public void makeOrder() {
        TourAgent newOrder = new TourAgent(travelTours);
        newOrder.orderKindOfTour(orderKindOfTour());
;
        newOrder.orderTransport(orderTransport());
        newOrder.orderNumberDays(orderNumDays());
        newOrder.orderNumberMeals(orderNumMeals());
        travelTours = newOrder.getTravelTours();
    }
}
