package com.example.demo.flight;

public class Flight {

    private final Integer flightId;
    private final String flightDestination;


    public Flight(Integer flightId, String flightDestination) {
        this.flightId = flightId;
        this.flightDestination = flightDestination;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public String getFlightDestination() {
        return flightDestination;
    }
}
