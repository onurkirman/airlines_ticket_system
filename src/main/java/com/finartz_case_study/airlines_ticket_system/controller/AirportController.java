package com.finartz_case_study.airlines_ticket_system.controller;


import com.finartz_case_study.airlines_ticket_system.model.Airport;
import com.finartz_case_study.airlines_ticket_system.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airport")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping
    public List<Airport> getAirportAll() {
        return airportService.getAirportAll();
    }

    @GetMapping("/id/{id}")
    public Airport getAirportById(@PathVariable("id") Long id){
        return airportService.getAirportById(id);
    }

    @GetMapping("/code/{code}")
    public Airport getAirlineCompanyByCode(@PathVariable("code") String code) throws Exception{
        return airportService.getAirportByCode(code);
    }

    @PostMapping
    public Airport newAirport(@RequestBody Airport airport){
        return airportService.newAirport(airport);
    }

}
