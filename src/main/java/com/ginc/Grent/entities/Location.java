package com.ginc.Grent.entities;

import com.ginc.Grent.enums.Country;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
@Data
@NoArgsConstructor
@Entity
@Table(name = "locations")
public class Location implements Serializable {
    Long id;
    String locationName;
    String locationAddress;
    Country country;
    String City;
    String phoneNumber;
    String workingHours;
}
