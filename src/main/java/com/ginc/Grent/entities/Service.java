package com.ginc.Grent.entities;

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
@Entity
@Table(name = "services")
public class Service implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long vehicleId;
    Long partnerId;
    String serviceDescription;
    LocalDateTime serviceStartTime;
    LocalDateTime serviceEndTime;
    BigDecimal serviceCost;
    Integer odoMeter;
}
