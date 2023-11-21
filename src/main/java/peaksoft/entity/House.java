package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "houses")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String houseType;
    private String address;
    private Integer price;
    private Integer room;
    private String country;
    private String description;
    private String isBooked;

    @ManyToOne(cascade = CascadeType.ALL)
    private Agency agency;

    @OneToOne(mappedBy = "house",cascade = CascadeType.ALL)
    private Booking booking;

}
