package com.demo.karacahotel.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String publicId = UUID.randomUUID().toString();
    private String identificationNumber;
    private String name;
    private String lastname;
    private int age;
    private String phoneNumber;
    private String mail;

    public Customer(String identificationNumber, String name,
                    String lastname, int age, String phoneNumber, String mail) {
        this.identificationNumber = identificationNumber;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }
}
