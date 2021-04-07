package com.finartz_case_study.airlines_ticket_system.controller;


import com.finartz_case_study.airlines_ticket_system.model.AirlineCompany;
import com.finartz_case_study.airlines_ticket_system.service.AirlineCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airline_company")
public class AirlineCompanyController {

    @Autowired
    private AirlineCompanyService airlineCompanyService;

    @GetMapping
    public List<AirlineCompany> getAirlineCompanyAll() {
        return airlineCompanyService.getAirlineCompanyAll();
    }

    @GetMapping("/id/{id}")
    public AirlineCompany getAirlineCompanyById(@PathVariable("id") Long id){
        return airlineCompanyService.getAirlineCompanyById(id);
    }

    @GetMapping("/code/{code}")
    public AirlineCompany getAirlineCompanyByCode(@PathVariable("code") String code) throws Exception{
        return airlineCompanyService.getAirlineCompanyByCode(code);
    }

    @PostMapping
    public AirlineCompany newAirlineCompany(@RequestBody AirlineCompany airlineCompany){
        return airlineCompanyService.newAirlineCompany(airlineCompany);
    }




}
