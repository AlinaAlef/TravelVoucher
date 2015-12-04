package com.epam.travelvoucher.touragent;

import com.epam.travelvoucher.traveltour.TravelTour;
import com.epam.travelvoucher.tours.Cruise;
import com.epam.travelvoucher.tours.Excursion;
import com.epam.travelvoucher.tours.Recreation;
import com.epam.travelvoucher.tours.Shopping;

import java.util.ArrayList;

/**
 * The {@code TravelAgent} presents travel agent
 * that contains all travel tours
 */
public class TourAgent {
    private ArrayList<TravelTour> travelTours;

    public TourAgent(ArrayList<TravelTour> travelTours) {
        this.travelTours = travelTours;
    }

    public ArrayList<TravelTour> getTravelTours() {
        return travelTours;
    }

    /*
    * Choose some  kind of tour
    *
    * @param kind
    *   is type of tour
    */
    public void orderKindOfTour(int kind) {
        ArrayList<TravelTour> order = new ArrayList<>();
        switch (kind) {
            case 1: {
                for (int numTour = 0; numTour < travelTours.size(); numTour++) {
                    if(travelTours.get(numTour) instanceof Cruise)  {
                        order.add(travelTours.get(numTour));
                    }
                }
                travelTours = order;
                return;
            }
            case 2: {
                for (int numTour = 0; numTour < travelTours.size(); numTour++) {
                    if(travelTours.get(numTour) instanceof Excursion)  {
                        order.add(travelTours.get(numTour));
                    }
                }
                travelTours = order;
                return;
            }
            case 3: {
                for (int numTour = 0; numTour < travelTours.size(); numTour++) {
                    if(travelTours.get(numTour) instanceof Recreation)  {
                        order.add(travelTours.get(numTour));
                    }
                }
                travelTours = order;
                return;
            }
            case 4: {
                for (int numTour = 0; numTour < travelTours.size(); numTour++) {
                    if(travelTours.get(numTour) instanceof Shopping)  {
                        order.add(travelTours.get(numTour));
                    }
                }
                travelTours = order;
                return;
            }
            default: {
                return;
            }
        }
    }

    /*
    * Choose some  kind of transport
    *
    * @param kind
    *   is type of transport
    */
    public void orderTransport(int kind) {
        ArrayList<TravelTour> order = new ArrayList<>();
        switch (kind) {
            case 1: {
                for (int numTour = 0; numTour < travelTours.size(); numTour++) {
                    if(travelTours.get(numTour).getTransport() == "train")  {
                        order.add(travelTours.get(numTour));
                    }
                }
                travelTours = order;
                return;
            }
            case 2: {
                for (int numTour = 0; numTour < travelTours.size(); numTour++) {
                    if(travelTours.get(numTour).getTransport() == "bus")  {
                        order.add(travelTours.get(numTour));
                    }
                }
                travelTours = order;
                return;
            }
            case 3: {
                for (int numTour = 0; numTour < travelTours.size(); numTour++) {
                    if(travelTours.get(numTour).getTransport() == "plane")  {
                        order.add(travelTours.get(numTour));
                    }
                }
                travelTours = order;
                return;
            }
            case 4: {
                for (int numTour = 0; numTour < travelTours.size(); numTour++) {
                    if(travelTours.get(numTour).getTransport() == "auto")  {
                        order.add(travelTours.get(numTour));
                    }
                }
                travelTours = order;
                return;
            }
            default: {
                return;
            }
        }
    }

    /*
    * Choose number of meals
    *
    * @param numberOfMeals
    *   is number of meals
    */
    public void orderNumberMeals(int numberMeals) {
        ArrayList<TravelTour> order = new ArrayList<>();
        for (int numTour = 0; numTour < travelTours.size(); numTour++) {
            if(travelTours.get(numTour).getNumberOfMeals() >= numberMeals)  {
                order.add(travelTours.get(numTour));
            }
        }
        travelTours = order;
        return;
    }

    /*
    * Choose number of days
    *
    * @param numberOfDays
    *   is number of days
    */
    public void orderNumberDays(int numberDays) {
        ArrayList<TravelTour> order = new ArrayList<>();
        if (numberDays <= 0) {
            travelTours = order;
            return;
        }
        for (int numTour = 0; numTour < travelTours.size(); numTour++) {
            if(travelTours.get(numTour).getDuringDays() == numberDays)  {
                order.add(travelTours.get(numTour));
            }
        }
        travelTours = order;
        return;
    }
}
