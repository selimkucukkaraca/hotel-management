package com.demo.karacahotel.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateRoomRequest {

    private String roomTitle;
    private BigDecimal price;
    private int numberOfRooms;
    private int roomCapacity;
    private int balcony;
}
