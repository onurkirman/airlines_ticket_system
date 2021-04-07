package com.finartz_case_study.airlines_ticket_system.repository;

import com.finartz_case_study.airlines_ticket_system.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "airport_repository")
public interface AirportRepository extends JpaRepository<Airport, Long> {

}


