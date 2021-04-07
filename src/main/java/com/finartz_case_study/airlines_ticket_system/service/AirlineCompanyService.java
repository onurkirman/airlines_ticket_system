package com.finartz_case_study.airlines_ticket_system.service;

import com.finartz_case_study.airlines_ticket_system.model.AirlineCompany;
import com.finartz_case_study.airlines_ticket_system.repository.AirlineCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service(value = "airlineCompanyService")
public class AirlineCompanyService {

    @Autowired
    private AirlineCompanyRepository airlineCompanyRepository;

    public AirlineCompany getAirlineCompanyById(Long id) {
        return airlineCompanyRepository.findById(id)
                                    .orElseThrow(() -> new RuntimeException("404"));
    }

    public AirlineCompany newAirlineCompany(AirlineCompany airlineCompany) {
        return airlineCompanyRepository.save(airlineCompany);
    }

    public List<AirlineCompany> getAirlineCompanyAll() {
        return airlineCompanyRepository.findAll();
    }

    public AirlineCompany getAirlineCompanyByCode(String code) throws Exception{
        List<AirlineCompany> list = airlineCompanyRepository.findAll().stream().collect(Collectors.toList());

        Long id = null;
        for (AirlineCompany l : list){
            if (l.getCode().equalsIgnoreCase(code)){
                id = l.getId();
            }
        }

        return airlineCompanyRepository.findById(id)
                    .orElseThrow(() -> new Exception("Airline Company Not Found!"));
    }
}
