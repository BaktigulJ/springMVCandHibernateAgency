package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "booking")
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Booking> bookings ;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Agency> agencies ;


}
