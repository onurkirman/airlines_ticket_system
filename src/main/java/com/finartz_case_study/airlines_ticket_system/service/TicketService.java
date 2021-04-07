package com.finartz_case_study.airlines_ticket_system.service;

import com.finartz_case_study.airlines_ticket_system.model.Flight;
import com.finartz_case_study.airlines_ticket_system.model.Ticket;
import com.finartz_case_study.airlines_ticket_system.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service(value = "ticketService")
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private FlightService flightService;

    public List<Ticket> getTicketAll() {
        return ticketRepository.findAll();
    }

    @Transactional
    public Ticket buyTicket(Ticket ticket) {
        Flight flight = flightService.getFlightById(ticket.getFlight().getId());

        ticket.setFlight(flight);
        ticket.setPrice(flight.getPriceCharge());
        flight.setFullness(flight.getFullness() + 1);

        // 10% Price increase per 10% quota increase
        double quota = flight.getFullness() / flight.getCapacity();

        if (quota % 0.1 == 0) {
            flight.setPriceCharge(flight.getPriceCharge() * 110 / 100);
        }

        // Card info. masking
        String updatedCardNumber = "";
        int counter = 1;
        for (char ch : ticket.getCreditCardNumber().toCharArray()){
            if (counter > 6 && counter < 13){
                updatedCardNumber += "*";
            } else {
                updatedCardNumber += ch;
            }
        }
        ticket.setCreditCardNumber(updatedCardNumber);

        return ticketRepository.save(ticket);
    }

    public ResponseEntity cancelTicket(Long id){
        try{
            ticketRepository.deleteById(id);
            return new ResponseEntity<>("Canceled the Ticket", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Could not Cancel the Ticket", HttpStatus.NOT_FOUND);
        }
    }
}
