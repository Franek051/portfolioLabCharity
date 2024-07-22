package pl.coderslab.charity.donation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.coderslab.charity.category.CategoryRepository;
import pl.coderslab.charity.institution.InstitutionRepository;
;


@Controller
public class DonationController {
    private final CategoryRepository categoryRepository;

    private final DonationRepository donationRepository;

    private final DonationService donationService;

    private final InstitutionRepository institutionRepository;

    public DonationController(CategoryRepository categoryRepository, DonationRepository donationRepository, DonationService donationService, InstitutionRepository institutionRepository) {
        this.categoryRepository = categoryRepository;
        this.donationRepository = donationRepository;
        this.donationService = donationService;
        this.institutionRepository = institutionRepository;
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("donation", new Donation());
        model.addAttribute("categories", categoryRepository.findAll());
        model.addAttribute("institution", institutionRepository.findAll());
        return "form";
    }

    @PostMapping("/form")
    public String submitForm(@ModelAttribute Donation donation) {
        donationService.saveDonations(donation);
        return "redirect:/form-confirmation";
    }

    @RequestMapping("/form-confirmation")
    public String confirmForm() {
        return "confirmation";
    }



}
