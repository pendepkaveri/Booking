package com.example.Booking.Repository;


import com.example.Booking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    static Optional<Object> FindById(Long id) {
        return null;
    }

    static Booking Save(Booking booking) {
        return booking;
    }

    static void DeleteById(Long id) {

    }
}



