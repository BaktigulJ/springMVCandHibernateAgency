package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String gender;
    private Long phoneNumberC;
    private Date localDate;
    private Date dateOfBirth;

    @OneToOne(cascade = CascadeType.ALL)
    private House house;

    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;


}
