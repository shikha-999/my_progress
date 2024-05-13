package org.example.dtos;

import org.example.models.Ticket;

public class IssueTicketResponseDTO {
    //for now send whole, but inform interviewer in short of time doint this, otherwise send only required info
    private Ticket ticket;
    private ResponseStatus responseStatus;
    private String failureString;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getFailureString() {
        return failureString;
    }

    public void setFailureString(String failureString) {
        this.failureString = failureString;
    }
}
