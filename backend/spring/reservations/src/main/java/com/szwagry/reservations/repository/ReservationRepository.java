package com.szwagry.reservations.repository;

import com.szwagry.reservations.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
