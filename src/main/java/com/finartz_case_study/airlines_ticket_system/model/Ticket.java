package com.finartz_case_study.airlines_ticket_system.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {

    private Flight flight;

    private int price;




}
