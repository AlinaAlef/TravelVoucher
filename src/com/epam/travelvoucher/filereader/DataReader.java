package com.epam.travelvoucher.filereader;
import com.epam.travelvoucher.traveltour.TravelTour;
import com.epam.travelvoucher.tours.Cruise;
import com.epam.travelvoucher.tours.Excursion;
import com.epam.travelvoucher.tours.Recreation;
import com.epam.travelvoucher.tours.Shopping;

import java.io.*;
import java.util.ArrayList;

/*
* The {@code DataReader} read list of offers from file
 */
public class DataReader {
	File file;

	public DataReader(String fileName) {
		file = new File(fileName);
	}

    /*
     * Transform string to integer
     */
	int toInteger(String str) {
		int index = 0;
		int number = 0;
		while(index < str.length() && ('0' <= str.charAt(index)) && (str.charAt(index) <= '9')) {
			number = number * 10 + Character.digit(str.charAt(index), 10);
			index++;
		}
		return number;
	}

    /*
    * Read all tours from file
    *
    * @return lists of tours
    * */
	public ArrayList<TravelTour> readTours() {
		StringBuilder sb = new StringBuilder();
        ArrayList<TravelTour> travelTours = new ArrayList<>();

		file.exists();

		try {
			BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
			try {
				String currentString;
                TravelTour tour;
                while ((currentString = in.readLine()) != null) {
                    switch (currentString) {
                        case "EXCURSION": {
                            tour = new Excursion();
                            currentString = in.readLine();
                            tour.setName(currentString);
                            currentString = in.readLine();
                            ((Excursion) tour).setNumberOfExcursions(toInteger(currentString));
                            currentString = in.readLine();
                            tour.setDuringDays(toInteger(currentString));
                            currentString = in.readLine();
                            tour.setNumberOfMeals(toInteger(currentString));
                            currentString = in.readLine();
                            tour.setPrice(toInteger(currentString));
                            travelTours.add((Excursion)tour);
                            break;
                        }
                        case "CRUISE": {
                            tour = new Cruise();
                            currentString = in.readLine();
                            tour.setName(currentString);
                            currentString = in.readLine();
                            ((Cruise) tour).setNameOfShip(currentString);
                            currentString = in.readLine();
                            tour.setDuringDays(toInteger(currentString));
                            currentString = in.readLine();
                            tour.setNumberOfMeals(toInteger(currentString));
                            currentString = in.readLine();
                            tour.setPrice(toInteger(currentString));
                            travelTours.add(tour);
                            break;
                        }
                        case "SHOPPING": {
                            tour = new Shopping();
                            currentString = in.readLine();
                            tour.setName(currentString);
                            currentString = in.readLine();
                            ((Shopping) tour).setNumberOfShops(toInteger(currentString));
                            currentString = in.readLine();
                            tour.setDuringDays(toInteger(currentString));
                            currentString = in.readLine();
                            tour.setNumberOfMeals(toInteger(currentString));
                            currentString = in.readLine();
                            tour.setPrice(toInteger(currentString));
                            travelTours.add(tour);
                            break;
                        }
                        case "RECREATION": {
                            tour = new Recreation();
                            currentString = in.readLine();
                            tour.setName(currentString);
                            currentString = in.readLine();
                            ((Recreation) tour).setIsMedical(currentString);
                            currentString = in.readLine();
                            tour.setDuringDays(toInteger(currentString));
                            currentString = in.readLine();
                            tour.setNumberOfMeals(toInteger(currentString));
                            currentString = in.readLine();
                            tour.setPrice(toInteger(currentString));
                            travelTours.add(tour);
                            break;
                        }
                        default:{
                            System.out.println("Exception");
                            break;
                        }
                  }
                }
			} finally {
				in.close();
			}
		} catch(IOException e) {
			throw new RuntimeException(e);
		}

		return travelTours;
	}

}
