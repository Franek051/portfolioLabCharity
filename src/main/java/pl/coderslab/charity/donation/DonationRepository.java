package pl.coderslab.charity.donation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DonationRepository extends JpaRepository<Donation, Long> {

    @Query("SELECT SUM (d.quantity) FROM Donation d")
    Integer findTotalQuantity();
    @Query("SELECT COUNT (d) FROM Donation d")
    Integer countAllDonations();

}
