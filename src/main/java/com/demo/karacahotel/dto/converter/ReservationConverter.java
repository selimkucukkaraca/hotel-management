package com.demo.karacahotel.dto.converter;

import com.demo.karacahotel.dto.ReservationDto;

import com.demo.karacahotel.model.Reservation;
import org.springframework.stereotype.Component;

@Component
public class ReservationConverter {

    private final RoomConverter roomConverter;
    private final CustomerConverter customerConverter;

    public ReservationConverter(RoomConverter roomConverter, CustomerConverter customerConverter) {
        this.roomConverter = roomConverter;
        this.customerConverter = customerConverter;
    }


    public ReservationDto convertReservationToReservationDto(Reservation from){
        return new ReservationDto(
                from.getReservationStartDate(),
                from.getReservationFinishDate(),
                from.getNumberOfGuests(),
                roomConverter.convertRoomToRoomDto(from.getRoom()),
                customerConverter.convertCustomerToCustomerDto(from.getCustomer()),
                from.getCreateDate(),
                from.getUpdateDate()
        );
    }

}
