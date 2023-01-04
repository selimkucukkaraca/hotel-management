package com.demo.karacahotel.repository;

import com.demo.karacahotel.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

    Optional<Reservation> findReservationByPublicId(String publicId);

}
