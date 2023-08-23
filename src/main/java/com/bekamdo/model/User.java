package com.bekamdo.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CollectionId;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    private String password;

   @ManyToOne(fetch = FetchType.EAGER,optional = false)
   @JoinColumn(name = "location_id")
    private Location location;

}
