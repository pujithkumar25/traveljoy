package com.traveljoy.controller;

import com.traveljoy.model.Booking;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "*") // Allow calls from your HTML
public class BookingController {

    @PostMapping
    public String createBooking(@RequestBody Booking booking) {
        System.out.println("Received booking for: " + booking.getName());
        return "Booking received for " + booking.getDestination();
    }
}
