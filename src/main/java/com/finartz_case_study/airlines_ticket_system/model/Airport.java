package com.finartz_case_study.airlines_ticket_system.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "airport")
public class Airport {

    private String name;

    private String number;

}
