package com.demo.karacahotel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class RoomDto {

    private String publicId;
    private String roomTitle;
    private BigDecimal price;
    private int numberOfRooms;
    private int roomCapacity;
    private int balcony;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

}
