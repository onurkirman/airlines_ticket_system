package com.finartz_case_study.airlines_ticket_system.repository;

import com.finartz_case_study.airlines_ticket_system.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "route_repository")
public interface RouteRepository extends JpaRepository<Route, Long> {

}


