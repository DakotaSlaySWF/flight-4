package com.example.flight;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ticket {
    private Passenger passenger;
    private int price;

    public Ticket(Passenger passenger, int price) {
        this.passenger = passenger;
        this.price = price;
    }

    public Ticket() {
        passenger = new Passenger();
        price = 200;
    }

    @JsonProperty ("Passenger")
    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @JsonProperty("Price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
