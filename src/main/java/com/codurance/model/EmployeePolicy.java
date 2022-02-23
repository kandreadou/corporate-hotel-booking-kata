package com.codurance.model;

import java.util.List;

public class EmployeePolicy {

    private String employeeId;
    private List<RoomType> rooms;

    public EmployeePolicy(String employeeId, List<RoomType> rooms){
        this.employeeId = employeeId;
        this.rooms = rooms;
    }

    public boolean isAllowed(RoomType type) {
        if (!rooms.isEmpty()) {
            return rooms.contains(type);
        }
        return false;
    }
}
