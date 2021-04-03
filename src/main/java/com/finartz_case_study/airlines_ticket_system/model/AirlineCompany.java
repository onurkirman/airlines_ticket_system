package com.finartz_case_study.airlines_ticket_system.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "airline_company")
public class AirlineCompany {

    private String name;

    private String number;

}
