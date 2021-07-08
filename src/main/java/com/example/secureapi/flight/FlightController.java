package com.example.secureapi.flight;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/flights")
public class FlightController {

    private static final List<Flight> FLIGHT_LIST = Arrays.asList(
        new Flight(1, "Belfast International"),
        new Flight(2, "Belfast City"),
        new Flight(3, "City of Derry"),
        new Flight(4, "Dublin")
    );

    @GetMapping(path = "/{flightId}")
    public Flight getFlight(@PathVariable("flightId") Integer flightId) {
        return FLIGHT_LIST.stream().filter(flight -> flightId.equals(flight.getFlightId())).findFirst()
            .orElseThrow(() -> new IllegalStateException("FlightId: " + flightId.toString() +", does not exist"));
    }
}
