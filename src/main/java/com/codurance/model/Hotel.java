package com.codurance.model;

import java.util.HashMap;
import java.util.Map;

public class Hotel {

    private String id;
    private Map<RoomType, Integer> rooms = new HashMap<>();

    public Hotel(String id){
        this.id = id;
    }

    public void setRoom(RoomType type, int quantity) {
        rooms.put(type, quantity);
    }
}
