package com.codurance.service;

import com.codurance.model.RoomType;

import java.util.Date;

public class BookingService {

    private BookingPolicyService policyService;
    private HotelService hotelService;

    public BookingService() {
        this.policyService = new BookingPolicyService();
        this.hotelService = new HotelService();
    }

    public boolean book(String employeeId, String hotelId, RoomType roomType, Date checkIn, Date checkOut) {
        if (hotelExists(hotelId) && policyService.isBookingAllowed(employeeId, roomType)) {
            return true;
        }
        return false;
    }

    private boolean hotelExists(String hotelId) {
        return hotelService.findHotelBy(hotelId) != null;
    }
}
