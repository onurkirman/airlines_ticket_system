package com.finartz_case_study.airlines_ticket_system.model;

import javax.persistence.*;

@Entity
@Table(name = "route")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "from_id", referencedColumnName = "id")
    private Airport from;

    @ManyToOne
    @JoinColumn(name = "to_id", referencedColumnName = "id")
    private Airport to;

    @Column(name = "code", length = 4, nullable = false, unique = true)
    private String code;

    public Route() {}

    public Route(Airport from, Airport to) {
        this.from = from;
        this.to = to;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Airport getFrom() {
        return from;
    }

    public void setFrom(Airport from) {
        this.from = from;
    }

    public Airport getTo() {
        return to;
    }

    public void setTo(Airport to) {
        this.to = to;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
