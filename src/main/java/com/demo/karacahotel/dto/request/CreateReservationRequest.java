package com.demo.karacahotel.dto.request;

import lombok.Data;

@Data
public class CreateReservationRequest {

    private String reservationStartDate;
    private String reservationFinishDate;
    private int numberOfGuests;
    private CreateCustomerRequest customerRequest;
    private CreateCreditCardRequest creditCardRequest;

}
