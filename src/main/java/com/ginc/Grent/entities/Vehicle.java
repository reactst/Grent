package com.ginc.Grent.entities;

import com.ginc.Grent.enums.*;
import jakarta.validation.constraints.Max;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Year;

@Entity
@NoArgsConstructor @Getter @Setter
@Table(name = "vehicles")
public class Vehicle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;
    @Enumerated(EnumType.STRING)
    private Make make;
    private String model;
    private Year year;
    @Enumerated(EnumType.STRING)
    private VehicleStatus vehicleStatus;
    @Enumerated(EnumType.STRING)
    private FuelType fuelType;
    @Enumerated(EnumType.STRING)
    private GearboxType gearboxType;
    private BigDecimal pricePerDay;
    @Max(8)
    private Integer fuelLevel;
}
