package com.finartz_case_study.airlines_ticket_system.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "route")
public class Route {

    private Airport from;

    private Airport to;

}
