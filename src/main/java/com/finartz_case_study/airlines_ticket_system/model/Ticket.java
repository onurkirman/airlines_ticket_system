package com.finartz_case_study.airlines_ticket_system.model;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column
    private Long flightId;

    @Column
    private double price;

    @Column(name = "credit_card_number", nullable = false, length = 16)
    private String creditCardNumber;

    public Ticket() {}

    public Ticket(Long flightId, double price, String creditCardNumber) {
        this.flightId = flightId;
        this.price = price;
        this.creditCardNumber = creditCardNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
