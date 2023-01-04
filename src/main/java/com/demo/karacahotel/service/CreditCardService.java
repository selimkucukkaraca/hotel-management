package com.demo.karacahotel.service;

import com.demo.karacahotel.dto.request.CreateCreditCardRequest;
import com.demo.karacahotel.model.CreditCard;
import com.demo.karacahotel.repository.CreditCardRepository;
import org.springframework.stereotype.Service;

@Service
public class CreditCardService {

    private final CreditCardRepository creditCardRepository;

    public CreditCardService(CreditCardRepository creditCardRepository) {
        this.creditCardRepository = creditCardRepository;
    }

    protected CreditCard save(CreateCreditCardRequest request) {
        var saved = new CreditCard(
                request.getNameAndLastname(),
                request.getCardNumber(),
                request.getExpirationDate(),
                request.getCvv()
        );

        return creditCardRepository.save(saved);
    }
}
