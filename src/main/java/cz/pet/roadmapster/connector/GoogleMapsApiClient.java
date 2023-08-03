package cz.pet.roadmapster.connector;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GoogleMapsApiClient {

    @Value("${google.maps.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public GoogleMapsApiClient() {
        this.restTemplate = new RestTemplate();
    }

    public String getDirections(String origin, String destination, String... waypoints) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            String apiUrl = "https://maps.googleapis.com/maps/api/directions/json";
            String waypointsStr = String.join("|", waypoints);
            String url = apiUrl + "?origin=" + origin + "&destination=" + destination
                    + "&waypoints=optimize:true|" + waypointsStr + "&key=" + apiKey;

            HttpEntity<String> request = new HttpEntity<>(headers);

            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, request, String.class);

            return response.getBody();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while fetching directions from Google Maps API.";
        }
    }
}

