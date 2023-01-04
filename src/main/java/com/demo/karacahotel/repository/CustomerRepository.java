package com.demo.karacahotel.repository;

import com.demo.karacahotel.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    boolean existsCustomerByIdentificationNumber(String identificationNumber);
    Optional<Customer> findCustomerByIdentificationNumber(String identificationNumber);
}
