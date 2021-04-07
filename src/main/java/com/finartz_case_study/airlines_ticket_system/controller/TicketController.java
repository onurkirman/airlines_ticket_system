package com.finartz_case_study.airlines_ticket_system.controller;

import com.finartz_case_study.airlines_ticket_system.model.Ticket;
import com.finartz_case_study.airlines_ticket_system.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping
    public List<Ticket> getTickets(){
        return ticketService.getTicketAll();
    }

    @PostMapping(path = "/buyTicket")
    public Ticket buyTicket(@RequestBody Ticket ticket) {
        return ticketService.buyTicket(ticket);
    }

    @DeleteMapping(path = "/cancelTicket/{id}")
    public ResponseEntity cancelTicket(@PathVariable Long id){
     return ticketService.cancelTicket(id);
    }
}
