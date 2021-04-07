package com.finartz_case_study.airlines_ticket_system.service;

import com.finartz_case_study.airlines_ticket_system.model.Flight;
import com.finartz_case_study.airlines_ticket_system.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service(value = "flightService")
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public Flight getFlightById(Long id) {
        return flightRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("404"));
    }

    public Flight newFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public List<Flight> getFlightAll() {
        return flightRepository.findAll();
    }

    public Flight getFlightByCode(String number) throws Exception {
        List<Flight> list = flightRepository.findAll().stream().collect(Collectors.toList());

        Long id = null;
        for (Flight l : list) {
            if (l.getNumber().equalsIgnoreCase(number)) {
                id = l.getId();
            }
        }

        return flightRepository.findById(id)
                .orElseThrow(() -> new Exception("Flight Not Found!"));
    }
}
