package com.finartz_case_study.airlines_ticket_system.service;

import com.finartz_case_study.airlines_ticket_system.model.Airport;
import com.finartz_case_study.airlines_ticket_system.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service(value = "airportService")
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;

    public Airport getAirportById(Long id) {
        return airportRepository.findById(id)
                                    .orElseThrow(() -> new RuntimeException("404"));
    }

    public Airport newAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    public List<Airport> getAirportAll() {
        return airportRepository.findAll();
    }

    public Airport getAirportByCode(String code) throws Exception{
        List<Airport> list = airportRepository.findAll().stream().collect(Collectors.toList());

        Long id = null;
        for (Airport l : list){
            if (l.getCode().equalsIgnoreCase(code)){
                id = l.getId();
            }
        }

        return airportRepository.findById(id)
                .orElseThrow(() -> new Exception("Airport Not Found!"));
    }
}
