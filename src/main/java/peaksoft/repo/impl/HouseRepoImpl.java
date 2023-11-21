package peaksoft.repo.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import peaksoft.entity.House;
import peaksoft.repo.HouseRepo;

import java.util.List;
import java.util.Optional;
@Repository
@Transactional
public class HouseRepoImpl implements HouseRepo {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<House> getAllHouse() {
        return entityManager.createQuery("select c from House c",House.class).getResultList();
    }

    @Override
    public void saveHouse(House house, Long houseSaveById) {

    }

    @Override
    public Optional<House> getHouseById(Long getHouseById) {
        return Optional.empty();
    }

    @Override
    public void deleteHouse(Long houseDeleteById) {

    }

    @Override
    public void updateHouse(Long id, House updateHouseById) {

    }

    @Override
    public List<House> getAllHouse(Long houseId) {
        return null;
    }
}
