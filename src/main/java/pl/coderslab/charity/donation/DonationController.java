package pl.coderslab.charity.donation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DonationController {

    private final DonationService donationService;


    public DonationController(DonationService donationService) {
        this.donationService = donationService;
    }


}
