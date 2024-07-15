package pl.coderslab.charity.institution;

import lombok.Getter;
import lombok.Setter;
import pl.coderslab.charity.donation.Donation;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Institution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;;

    @OneToMany(mappedBy = "institution")
    private Set<Donation> donations;
}
