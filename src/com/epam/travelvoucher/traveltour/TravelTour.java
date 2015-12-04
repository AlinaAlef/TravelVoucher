package com.epam.travelvoucher.traveltour;

import java.util.Comparator;

/**
 * The {@code TravelTour presents travel voucher}
 */
public abstract class TravelTour implements Comparable<TravelTour> {
    private String name;
    protected String transport;
    private int numberOfMeals;
    private int duringDays;
    private int price;

    /*
    * get name of TravelTour
    * @return name
    * */
    public String getName() {
        return name;
    }

    /*
    * get price of TravelTour
    * @return price
    * */
    public int getPrice() {
        return price;
    }

    /*
    * get transport of TravelTour
    * @return transport
    * */
    public String getTransport() {
        return transport;
    }

    /*
    * get number of meals of TravelTour
    * @return number of meals
    * */
    public int getNumberOfMeals() {
        return numberOfMeals;
    }

    public int getDuringDays() {
        return duringDays;
    }

    /*
    * set name of TravelTour
    * @param name
    * */
    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfMeals(int numberOfMeals) {
        this.numberOfMeals = numberOfMeals;
    }

    public void setDuringDays(int duringDays) {
        this.duringDays = duringDays;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelTour that = (TravelTour) o;
        return price == that.price;
    }

    @Override
    public int hashCode() {
        return price;
    }

    /*
    * compare two tours by price
    *
    * @param tour1
    *   the initial of first travel tour
    *
    * @param tour1
    *   the initial of first travel tour*
    *
    * @return
    *   1 if this tour price bigger then another {@code tour1}
    *   0 if this tour  price equal to another price {@code tour2}
    *   -1 in another way
    * */
    public int compare(Object tour1, Object tour2) {
        if (((TravelTour)tour1).getPrice() > ((TravelTour)tour2).getPrice()) {
            return 1;
        }
        if (((TravelTour)tour1).getPrice() < ((TravelTour)tour2).getPrice()) {
            return -1;
        }
        return 0;
    }



    protected abstract void setTransport();

    public abstract void printTour();

    /*
    * compare two tours
    * @param compareTour
    *   the initial of another travel tour
    *
    * @return
    *   1 if this tour bigger then another {@code compareTour}
    *   0 if this tour equal to another {@code compareTour}
    *   -1 in another way
    * */
    public int compareTo(TravelTour compareTour) {

        int comparePrice = ((TravelTour) compareTour).getPrice();

        //ascending touragent
        return this.price - comparePrice;

    }

    public static Comparator<TravelTour> TravelTourComparator = new Comparator<TravelTour>() {

        public int compare(TravelTour fruit1, TravelTour fruit2) {

            String Name1 = fruit1.getName().toUpperCase();
            String Name2 = fruit2.getName().toUpperCase();

            return Name1.compareTo(Name2);
        }

    };
}



