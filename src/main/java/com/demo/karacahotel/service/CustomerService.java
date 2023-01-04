package com.demo.karacahotel.service;

import com.demo.karacahotel.dto.CustomerDto;
import com.demo.karacahotel.dto.converter.CustomerConverter;
import com.demo.karacahotel.dto.request.CreateCustomerRequest;
import com.demo.karacahotel.model.Customer;
import com.demo.karacahotel.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerConverter customerConverter;

    public CustomerService(CustomerRepository customerRepository, CustomerConverter customerConverter) {
        this.customerRepository = customerRepository;
        this.customerConverter = customerConverter;
    }

    protected Customer save(CreateCustomerRequest request){
        var saved = new Customer(
                request.getIdentificationNumber(),
                request.getName(),
                request.getLastname(),
                request.getAge(),
                request.getPhoneNumber(),
                request.getMail()
        );

        if (customerRepository.existsCustomerByIdentificationNumber(saved.getIdentificationNumber())){
            throw new RuntimeException();
        }

        return customerRepository.save(saved);
    }

    public void delete(String identificationNumber){
        var fromCustomer = getCustomerByIdentificationNumber(identificationNumber);
        customerRepository.delete(fromCustomer);
    }

    protected Customer getCustomerByIdentificationNumber(String identificationNumber){
        return customerRepository.findCustomerByIdentificationNumber(identificationNumber)
                .orElseThrow(RuntimeException::new);
    }
}
