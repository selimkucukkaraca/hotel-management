package com.demo.karacahotel.dto.converter;

import com.demo.karacahotel.dto.CreditCardDto;
import com.demo.karacahotel.model.CreditCard;
import org.springframework.stereotype.Component;

@Component
public class CreditCardRequest {

    public CreditCardDto convertCreditCardToCreditCardDto(CreditCard from){
        return new CreditCardDto(
                from.getNameAndLastname(),
                from.getCardNumber(),
                from.getExpirationDate(),
                from.getCvv(),
                from.getCreateDate(),
                from.getUpdateDate()
        );
    }
}
