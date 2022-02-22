package com.codurance.model;

public class Room {

    private RoomType type;
    private int quantity;

    public Room(RoomType type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }
}
