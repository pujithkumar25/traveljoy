package com.traveljoy.controller;

import com.traveljoy.model.Booking;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "*")
public class BookingController {

    @PostMapping
    public String createBooking(@RequestBody Booking booking) {
        return "Booking received for " + booking.getDestination();
    }
}
