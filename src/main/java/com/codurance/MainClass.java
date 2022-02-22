package com.codurance;

import com.codurance.model.RoomType;
import com.codurance.service.HotelService;

public class MainClass {

    public static void main(String[] args){
        HotelService s = new HotelService();
        s.setRoomType("test", RoomType.DOUBLE, 3);
    }
}
