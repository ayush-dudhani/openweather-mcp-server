package org.keepcalm.service;

import lombok.RequiredArgsConstructor;
import org.keepcalm.config.OpenWeatherConfig;
import org.keepcalm.models.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final RestTemplate restTemplate;
    private final OpenWeatherConfig config;

    public WeatherResponse getWeather(String city) {
        String url = config.getBaseUrl() +
                "?q=" + city +
                "&appid=" + config.getApiKey();

        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}
