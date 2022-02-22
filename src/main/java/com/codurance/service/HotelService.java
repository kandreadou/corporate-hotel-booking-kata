package com.codurance.service;

import com.codurance.model.Hotel;

public interface HotelService {

    void setRoomType(String hotelId, String roomType, int quantity);

    Hotel findHotelBy(String hotelId);
}
