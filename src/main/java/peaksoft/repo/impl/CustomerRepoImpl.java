package peaksoft.repo.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import peaksoft.entity.Customer;
import peaksoft.repo.CustomerRepo;

import java.util.List;
import java.util.Optional;
@Repository
@Transactional
public class CustomerRepoImpl implements CustomerRepo {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Customer> getAllCustomer() {
        return entityManager.createQuery("select c from Customer c", Customer.class).getResultList();
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
