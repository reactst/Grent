package com.ginc.Grent.entities;

import com.ginc.Grent.enums.*;
import jakarta.validation.constraints.Max;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Table(name = "vehicles")
@Entity
public class Vehicle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long locationId;
    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;
    @Enumerated(EnumType.STRING)
    private Make make;
    private String model;
    private LocalDateTime year;
    private String registrationNumber;
    private LocalDateTime registrationDate;
    @Enumerated(EnumType.STRING)
    private VehicleStatus vehicleStatus;
    @Enumerated(EnumType.STRING)
    private FuelType fuelType;
    @Max(8)
    private Integer fuelLevel;
    @Enumerated(EnumType.STRING)
    private GearboxType gearboxType;
    private BigDecimal pricePerDay;
    private Integer odoMeter;
}
