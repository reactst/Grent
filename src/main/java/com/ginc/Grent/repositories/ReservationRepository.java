package com.ginc.Grent.repositories;

import com.ginc.Grent.entities.Reservation;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface ReservationRepository extends Repository<Long, Reservation> {
    Optional<Long> findById(Reservation reservation);
    Optional<Long> findByVehicleId(Reservation reservation);
    Optional<Long> findByEmployeeId(Reservation reservation);
    Optional<Long> findByUserId(Reservation reservation);
    Optional<Long> findByReservationStatus(Reservation reservation);
}
