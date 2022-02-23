package com.codurance.service;

import com.codurance.model.Hotel;
import com.codurance.model.RoomType;
import com.codurance.repository.HotelRepository;

public class HotelService {

    private HotelRepository repo;

    public HotelService(){
        this.repo = HotelRepository.getInstance();
    }

    public void setRoomType(String hotelId, RoomType roomType, int quantity) {
        Hotel h = repo.exists(hotelId) ? repo.get(hotelId): new Hotel(hotelId);
        h.setRoom(roomType, quantity);
        repo.save(hotelId, h);
    }

    public Hotel findHotelBy(String hotelId) {
        return repo.exists(hotelId) ? repo.get(hotelId): null;
    }
}
