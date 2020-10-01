package com.spring.restapi.service;

import com.spring.restapi.domain.Customer;
import com.spring.restapi.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void save(Customer customer){
        log.info("Creating customer in CustomerService ", customer);
        this.customerRepository.save(customer);
    }

    public void remove(long id){
        log.info("Removing customer in CustomerService, id = ", id);
        this.customerRepository.deleteById(id);
    }

    public Customer getById(long id){
        log.info("Getting customer in CustomerService, id = ", id);
        return this.customerRepository.findById(id).orElse(new Customer());
    }

    public List<Customer> getAll(){
        log.info("Getting list of customers in CustomerService");
        return this.customerRepository.findAll();
    }
}
