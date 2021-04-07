package com.finartz_case_study.airlines_ticket_system.controller;

import com.finartz_case_study.airlines_ticket_system.model.Flight;
import com.finartz_case_study.airlines_ticket_system.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/number/{number}")
    public Flight getFlightByNumber(@PathVariable String number) throws Exception{
        return flightService.getFlightByCode(number);
    }

    @PostMapping
    public Flight newFlight(@RequestBody Flight flight){
        return flightService.newFlight(flight);
    }
}
