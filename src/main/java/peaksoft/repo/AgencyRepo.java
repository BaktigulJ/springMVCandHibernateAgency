package peaksoft.repo;

import peaksoft.entity.Agency;

import java.util.List;
import java.util.Optional;

public interface AgencyRepo {
    List<Agency> getAllAgency();
    void saveAgency(Agency agency);
    Optional<Agency> getAgencyById(Long getAgencyById);
void deleteAgency(Long agencyDeleteById);
void updateAgency(Long id, Agency updateAgencyById);
List<Agency> getAllAgency(Long agencyId);

}
