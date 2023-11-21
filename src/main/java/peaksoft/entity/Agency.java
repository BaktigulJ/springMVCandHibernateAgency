package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Data
@Table(name = "agency")
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;
    private Long phoneNumber;
    private String email;
    @Column(length = 2000000)

    @OneToMany(mappedBy = "agency")
    private List<House> houses ;

    @ManyToMany(mappedBy = "agencies")
    private List<Customer> customers ;

}
