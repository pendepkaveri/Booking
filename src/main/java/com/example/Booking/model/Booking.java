package com.example.Booking.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private LocalDate bookingDate;
    private String destination;
    private int numberOfPersons;
    private String modeOfTransport;
    private LocalDate startDate;
    private LocalDate endDate;
    private String travelPackage;
}
