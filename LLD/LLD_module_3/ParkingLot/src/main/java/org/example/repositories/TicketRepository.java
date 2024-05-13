package org.example.repositories;

import org.example.models.Ticket;

import java.util.HashMap;

public class TicketRepository {
    private HashMap<String, Ticket> ticketRepo = new HashMap<>();
    private int prevId = 0;
    public Ticket saveTicket(Ticket ticket){
        //logic to save ticket to repository
        prevId += 1;
        ticket.setId((long)prevId);
        ticketRepo.put(ticket.getTicketNumber(), ticket);
        return ticket;
    }
}
