package com.ginc.Grent.entities;

import com.ginc.Grent.enums.Role;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

import com.ginc.Grent.enums.Country;
@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String firstName;
    private String lastName;
    @Email
    private Email email;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Country country;
    private LocalDateTime dateOfBirth;
    private String driverLicenseNumber;

}
