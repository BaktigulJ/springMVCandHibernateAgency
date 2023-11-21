package peaksoft.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.entity.Customer;
import peaksoft.repo.CustomerRepo;
import peaksoft.service.CustomerService;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor

public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;
    @Override
    public List<Customer> getAllCustomer() {
        return customerRepo.getAllCustomer();
    }

    @Override
    public void saveBooking(Customer customer, Long customerSaveById) {

    }

    @Override
    public Optional<Customer> getCustomerById(Long getCustomerById) {
        return Optional.empty();
    }

    @Override
    public void deleteCustomer(Long customerDeleteById) {

    }

    @Override
    public void updateCustomer(Long id, Customer updateCustomerById) {

    }

    @Override
    public List<Customer> getAllCustomer(Long customerId) {
        return null;
    }
}
