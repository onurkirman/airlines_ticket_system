package com.finartz_case_study.airlines_ticket_system.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "number")
    private String number;

    @ManyToOne
    @JoinColumn(name = "airline_company_id", referencedColumnName = "id")
    private AirlineCompany company;

    @ManyToOne
    @JoinColumn(name = "route_id", referencedColumnName = "id")
    private Route route;

    @Column(name = "flight_date", nullable = false)
    private Timestamp date;

    @Column
    private int capacity;

    @Column
    private int fullness;

    @Column(name = "price_charge")
    private int priceCharge;

    public Flight() {}

    public Flight(String number, AirlineCompany company, Route route, Timestamp date, int capacity, int fullness, int priceCharge) {
        this.number = number;
        this.company = company;
        this.route = route;
        this.date = date;
        this.capacity = capacity;
        this.fullness = fullness;
        this.priceCharge = priceCharge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public AirlineCompany getCompany() {
        return company;
    }

    public void setCompany(AirlineCompany company) {
        this.company = company;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPriceCharge() {
        return priceCharge;
    }

    public void setPriceCharge(int priceCharge) {
        this.priceCharge = priceCharge;
    }

    public int getFullness() {
        return fullness;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
