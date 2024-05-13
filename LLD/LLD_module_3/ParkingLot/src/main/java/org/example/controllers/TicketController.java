package org.example.controllers;

import org.example.dtos.IssueTicketRequestDTO;
import org.example.dtos.IssueTicketResponseDTO;
import org.example.dtos.ResponseStatus;
import org.example.models.Ticket;
import org.example.service.TicketService;

//waiters - controllers
// are SPECIFIC
//at the time of entry, a ticket is generated
//parameters wrapped in DTO
//don't write business logic inside controller, should be in SERVICE
public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO issueTicketRequestDTO) {
        //return response DTO
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();

        //calling SERVICE.method()
        //controllers don't throw exception, they send well formed responses to client and not stack traces
        Ticket ticket = null;
        try {
            ticket = ticketService.issueTicket(
                    issueTicketRequestDTO.getVehicleType(),
                    issueTicketRequestDTO.getVehicleNumber(),
                    issueTicketRequestDTO.getVehicleOwnerName(),
                    issueTicketRequestDTO.getGateId()
            );
        }catch (Exception ex){   //create a custom exception...explain in interview
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setFailureString("Failed to create the ticket..." + ex.getMessage());
        }

        response.setResponseStatus(ResponseStatus.SUCCESS);
        response.setTicket(ticket);

        return response;
    }
}