package peaksoft.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.entity.House;
import peaksoft.repo.HouseRepo;
import peaksoft.service.HouseService;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor

public class HouseServiceImpl implements HouseService {

    private final HouseRepo houseRepo;
    @Override
    public List<House> getAllHouse() {
        return houseRepo.getAllHouse();
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
