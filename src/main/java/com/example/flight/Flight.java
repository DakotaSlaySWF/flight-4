package com.example.flight;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Flight {

    private LocalDateTime departs;
    private List<Ticket> tickets;


    public Flight(LocalDateTime departs, List<Ticket> tickets) {
        this.departs = departs;
        this.tickets = tickets;
    }

    public Flight() {
        departs = LocalDateTime.of(2017, 4, 21, 14, 34);
        tickets = new ArrayList<>();
        tickets.add(new Ticket());
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonProperty("Departs")
    public LocalDateTime getDeparts() {
        return departs;
    }

    public void setDeparts(LocalDateTime departs) {
        this.departs = departs;
    }

    @JsonProperty ("Tickets")
    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }


}
