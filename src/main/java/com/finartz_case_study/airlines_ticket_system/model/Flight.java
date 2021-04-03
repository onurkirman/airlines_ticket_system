package com.finartz_case_study.airlines_ticket_system.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "flight")
public class Flight {

    private AirlineCompany company;

    private Route route;

    private int capacity;

    private int priceCharge;

    private String number;

    private Timestamp date;


}
