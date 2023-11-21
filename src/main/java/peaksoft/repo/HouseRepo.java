package peaksoft.repo;

import peaksoft.entity.House;

import java.util.List;
import java.util.Optional;

public interface HouseRepo {
    List<House> getAllHouse();
    void saveHouse(House house, Long houseSaveById);
    Optional<House> getHouseById(Long getHouseById);
    void deleteHouse(Long houseDeleteById);
    void updateHouse(Long id, House updateHouseById);
    List<House> getAllHouse(Long houseId);
}
