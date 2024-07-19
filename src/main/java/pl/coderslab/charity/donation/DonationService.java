package pl.coderslab.charity.donation;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationService {

    private final DonationRepository donationRepository;

    public DonationService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    public Donation saveDonations(Donation donation) {
        return donationRepository.save(donation);
    }
}
