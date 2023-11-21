package peaksoft.service;

import peaksoft.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAllCustomer();
    void saveBooking(Customer customer, Long customerSaveById);
    Optional<Customer> getCustomerById(Long getCustomerById);
    void deleteCustomer(Long customerDeleteById);
    void updateCustomer(Long id, Customer updateCustomerById);
    List<Customer> getAllCustomer(Long customerId);
}
