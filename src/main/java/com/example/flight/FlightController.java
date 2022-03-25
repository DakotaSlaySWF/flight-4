package com.example.flight;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @GetMapping("/flight")
    public Flight getFlight() {

        return new Flight();
    }

    @GetMapping("")
    public List<Flight> getFlights() {

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight());
        flights.add(new Flight());
        flights.get(1).getTickets().get(0).getPassenger().setFirstName("Some other name");
        flights.get(1).getTickets().get(0).getPassenger().setLastName(null);
        flights.get(1).getTickets().get(0).setPrice(400);
        return flights;
    }
}













