package com.ginc.Grent.entities;

import com.ginc.Grent.enums.PaymentType;
import com.ginc.Grent.enums.ReservationStatus;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@Entity
@Table(name = "reservations")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long vehicleId;
    private Long employeeId;
    private Long userId;
    private LocalDateTime rentStartTime;
    private LocalDateTime rentEndTime;
    private PaymentType paymentType;
    private ReservationStatus reservationStatus;

}
