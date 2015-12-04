package com.epam.travelvoucher.user;

import com.epam.travelvoucher.filereader.DataReader;
import com.epam.travelvoucher.touragent.TourAgentInterface;
import com.epam.travelvoucher.traveltour.TravelTour;

import java.util.*;

/**
 * Created by alef on 09.11.15.
 */
public class JavaApplication {


    public static void main(String[] args) {
        DataReader fileWorker = new DataReader("tours.txt");
        ArrayList<TravelTour> travelTours;
        travelTours = fileWorker.readTours();

        TourAgentInterface order = new TourAgentInterface(travelTours);
        order.makeOrder();

        order.printSortedVariants();
        order.printOrder();

    }
}
