package com.codurance.repository;

import com.codurance.model.Hotel;

public class HotelRepository extends AbstractRepository<Hotel> {

    private static HotelRepository singletonInstance;

    private HotelRepository() {
    }

    public static HotelRepository getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new HotelRepository();
        }
        return singletonInstance;
    }
}
