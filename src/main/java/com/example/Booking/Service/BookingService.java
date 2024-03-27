package com.example.Booking.Service;


import com.example.Booking.model.Booking;

import java.util.List;

public interface BookingService {
    List<Booking> findAll();
    Booking findById(Long id);
    Booking save(Booking booking);
    void deleteById(Long id);
}


