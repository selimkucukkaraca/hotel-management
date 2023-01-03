package com.demo.karacahotel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CustomerDto {

    private String identificationNumber;
    private String name;
    private String lastname;
    private int age;
    private String phoneNumber;
    private String mail;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
