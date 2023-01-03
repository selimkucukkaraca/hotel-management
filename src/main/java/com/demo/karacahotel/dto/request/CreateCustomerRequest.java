package com.demo.karacahotel.dto.request;

import lombok.Data;

@Data
public class CreateCustomerRequest {

    private String identificationNumber;
    private String name;
    private String lastname;
    private int age;
    private String phoneNumber;
    private String mail;
}
