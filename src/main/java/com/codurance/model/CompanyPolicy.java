package com.codurance.model;

import java.util.List;

public class CompanyPolicy {

    private String companyId;
    private List<RoomType> rooms;

    public CompanyPolicy(String companyId, List<RoomType> rooms){
        this.companyId = companyId;
        this.rooms = rooms;
    }

    public boolean isAllowed(RoomType type) {
        if (!rooms.isEmpty()) {
            return rooms.contains(type);
        }
        return false;
    }
}
