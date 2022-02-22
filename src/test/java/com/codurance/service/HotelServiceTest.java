package com.codurance.service;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.codurance.model.RoomType;
import com.codurance.repository.HotelRepository;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class HotelServiceTest {


    /**
     * The setRoomType(...) method should create a hotel if there are no hotels with the received ID and update its room
     * type according to the information received. A change in quantity of rooms should not not affect existing bookings.
     * They will only affect new bookings, made after the change.
     */
    @Test
    public void createHotelIfNotExists() {
        HotelRepository repository = HotelRepository.getInstance();
        HotelService hotelService = new HotelService();
        hotelService.setRoomType(UUID.randomUUID().toString(), RoomType.SUITE, 5);
        assertFalse(repository.count() == 0);
    }

}
