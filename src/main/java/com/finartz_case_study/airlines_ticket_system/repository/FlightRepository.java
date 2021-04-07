package com.finartz_case_study.airlines_ticket_system.repository;

import com.finartz_case_study.airlines_ticket_system.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "flight_repository")
public interface FlightRepository extends JpaRepository<Flight, Long> {

}


