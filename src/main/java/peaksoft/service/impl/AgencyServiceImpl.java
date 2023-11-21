package peaksoft.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.entity.Agency;
import peaksoft.repo.AgencyRepo;
import peaksoft.service.AgencyService;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor

public class AgencyServiceImpl implements AgencyService {

    private final AgencyRepo agencyRepo;
    @Override
    public List<Agency> getAllAgency() {
        return agencyRepo.getAllAgency();
    }

    @Override
    public void saveAgency(Agency agency) {
agencyRepo.saveAgency(agency);
    }

    @Override
    public Optional<Agency> getAgencyById(Long getAgencyById) {
        return Optional.empty();
    }

    @Override
    public void deleteAgency(Long agencyDeleteById) {
agencyRepo.deleteAgency(getAgencyById(agencyDeleteById).get().getId());
    }

    @Override
    public void updateAgency(Long id, Agency updateAgencyById) {
agencyRepo.updateAgency(getAgencyById(id).get().getId(), updateAgencyById);
    }

    @Override
    public List<Agency> getAllAgency(Long agencyId) {
        return null;
    }
}
