package com.example.secureapi.flight;

import lombok.Data;

@Data
public class Flight {

    private final Integer flightId;
    private final String flightDestination;


    public Flight(Integer flightId, String flightDestination) {
        this.flightId = flightId;
        this.flightDestination = flightDestination;
    }

}
