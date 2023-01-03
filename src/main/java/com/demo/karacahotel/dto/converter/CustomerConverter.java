package com.demo.karacahotel.dto.converter;

import com.demo.karacahotel.dto.CustomerDto;
import com.demo.karacahotel.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerConverter {

    public CustomerDto convertCustomerToCustomerDto(Customer from){
        return new CustomerDto(
                from.getIdentificationNumber(),
                from.getName(),
                from.getLastname(),
                from.getAge(),
                from.getPhoneNumber(),
                from.getMail(),
                from.getCreateDate(),
                from.getUpdateDate()
        );
    }

}
