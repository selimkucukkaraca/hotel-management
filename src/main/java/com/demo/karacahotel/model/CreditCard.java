package com.demo.karacahotel.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CreditCard extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameAndLastname;
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public CreditCard(String nameAndLastname, String cardNumber,
                      String expirationDate, String cvv) {
        this.nameAndLastname = nameAndLastname;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }
}
