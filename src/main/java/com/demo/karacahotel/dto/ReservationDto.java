package com.demo.karacahotel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ReservationDto {

    private String publicId;
    private String reservationStartDate;
    private String reservationFinishDate;
    private int numberOfGuests;
    private RoomDto roomDto;
    private CustomerDto customerDto;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
