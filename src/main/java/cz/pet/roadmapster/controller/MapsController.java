package cz.pet.roadmapster.controller;

import cz.pet.roadmapster.connector.GoogleMapsApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/maps")
public class MapsController {

    private final GoogleMapsApiClient googleMapsApiClient;

    @Autowired
    public MapsController(GoogleMapsApiClient googleMapsApiClient) {
        this.googleMapsApiClient = googleMapsApiClient;
    }

    @GetMapping("/directions")
    public String getDirections(@RequestParam String origin, @RequestParam String destination,
                                @RequestParam(required = false) String[] waypoints) {
        if (waypoints == null) {
            waypoints = new String[0];
        }
        return googleMapsApiClient.getDirections(origin, destination, waypoints);
    }
}
