package com.demo.karacahotel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CreditCardDto {

    private String nameAndLastname;
    private String cardNumber;
    private String expirationDate;
    private String cvv;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
