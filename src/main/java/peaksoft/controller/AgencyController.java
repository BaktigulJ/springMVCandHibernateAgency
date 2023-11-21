package peaksoft.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import peaksoft.entity.Agency;
import peaksoft.service.AgencyService;

@Controller
@RequestMapping("/agency")
@RequiredArgsConstructor

public class AgencyController {

    private final AgencyService agencyService;

    @GetMapping
    public String getAllAgency(Model model){
        model.addAttribute("getAllAgencies",agencyService.getAllAgency());
        return "mainPage";
    }
    @GetMapping("/new")
    public String createAgency(Model model){
        model.addAttribute("createNewAgency",new Agency());
        return "newAgency";
    }

    @PostMapping("/save")
    public String saveAgency(@ModelAttribute("createNewAgency") Agency agency){
        agencyService.saveAgency(agency);
        return "redirect:/agency";
    }

    @GetMapping("/update/{agencyId}")
    public String getAgencyById(@PathVariable Long agencyId, Model model) {
        model.addAttribute("updateAgencies", agencyService.getAgencyById(agencyId));
        return "agency/updateAgency";
    }


    @PostMapping("/replace/{backendId}")
    public String updateAgencies(@ModelAttribute Agency agency, @PathVariable Long agencyId) {
        agencyService.updateAgency(agencyId, agency);
        return "redirect:/agency";
    }

   @GetMapping("/delete/{agencyId}")
   public String deleteAgency(@PathVariable Long agencyId) {
       agencyService.deleteAgency(agencyId);
       return "redirect:/agency";
   }
}
