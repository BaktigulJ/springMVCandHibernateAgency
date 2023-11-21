package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Table(name = "agencies")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;
    private Long phoneNumber;
    private String email;

    @OneToMany(mappedBy = "agency",cascade = CascadeType.ALL)
    private List<House> houses;

    @ManyToMany(mappedBy = "agencies",cascade = CascadeType.ALL)
    private List<Customer> customers;

}
