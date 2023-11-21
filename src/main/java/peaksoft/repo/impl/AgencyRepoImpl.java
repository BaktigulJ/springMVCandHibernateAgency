package peaksoft.repo.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import peaksoft.entity.Agency;
import peaksoft.entity.Customer;
import peaksoft.repo.AgencyRepo;

import java.util.List;
import java.util.Optional;
@Repository
@Transactional
public class AgencyRepoImpl implements AgencyRepo {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Agency> getAllAgency() {
        return entityManager.createQuery("select c from Agency c",Agency.class).getResultList();
    }

    @Override
    public void saveAgency(Agency agency) {
       entityManager.persist(agency);
    }

    @Override
    public Optional<Agency> getAgencyById(Long getAgencyById) {
        return Optional.empty();
    }

    @Override
    public void deleteAgency(Long agencyDeleteById) {
       Agency agency=entityManager.find(Agency.class,agencyDeleteById);
       if(agency==null){
          List<Customer> customerList= agency.getCustomers();
          for(Customer c: customerList){
              if(c.getCustomer().getId()==agencyDeleteById){
                  agency.getCustomers().remove(c);
              }
          }
          entityManager.remove(agency);
       }

    }

    @Override
    public void updateAgency(Long id, Agency updateAgencyById) {
        Agency agency2 = entityManager.find(Agency.class, id);
        agency2.setName(agency2.getName());
        agency2.setCustomers(agency2.getCustomers());
        agency2.setHouses(agency2.getHouses());
        agency2.setEmail(agency2.getEmail());
        agency2.setPhoneNumber(agency2.getPhoneNumber());
        entityManager.merge(agency2);
    }

    @Override
    public List<Agency> getAllAgency(Long agencyId) {
        return null;
    }
}
