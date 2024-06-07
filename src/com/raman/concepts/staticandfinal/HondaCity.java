package com.raman.concepts.staticandfinal;

/**
 * static variables are allocated in method area,not in heap.They are available once class is loaded.
 * They belong to class, and are shared by objects.
 * We cannot use this or super in static things because these belongs to instance.
 */
public class HondaCity {
    public static Long BASE_PRICE = 100000L;

    public static Double onRoadPrice(String city) {
        switch (city) {
            case "delhi":
                return BASE_PRICE + BASE_PRICE * 0.1;
            case "mumbai":
                return BASE_PRICE + BASE_PRICE * 0.09;
            default: 
                return BASE_PRICE + BASE_PRICE * 0.5;
        }
    }
}
