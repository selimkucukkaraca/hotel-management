package com.demo.karacahotel.dto.request;

import lombok.Data;

@Data
public class CreateCreditCardRequest {

    private String nameAndLastname;
    private String cardNumber;
    private String expirationDate;
    private String cvv;
}
