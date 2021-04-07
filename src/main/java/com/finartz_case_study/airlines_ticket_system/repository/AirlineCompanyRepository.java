package com.finartz_case_study.airlines_ticket_system.repository;

import com.finartz_case_study.airlines_ticket_system.model.AirlineCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "airline_company_repository")
public interface AirlineCompanyRepository extends JpaRepository<AirlineCompany, Long> {

}


