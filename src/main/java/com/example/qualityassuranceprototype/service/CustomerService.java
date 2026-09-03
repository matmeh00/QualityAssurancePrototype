package com.example.qualityassuranceprototype.service;

import com.example.qualityassuranceprototype.entity.Customer;
import com.example.qualityassuranceprototype.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.saveAndFlush(customer);
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.getReferenceById(id);
    }

    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.saveAndFlush(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

}
