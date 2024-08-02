package com.ginc.Grent.entities;

import com.ginc.Grent.enums.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

import com.ginc.Grent.enums.Country;
@NoArgsConstructor @Getter @Setter
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Role role;
    private String firstName;
    private String lastName;
    private Country country;
    private LocalDateTime dateOfBirth;
    private String driverLicenseNumber;

}
