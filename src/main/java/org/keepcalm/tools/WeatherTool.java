package org.keepcalm.tools;

import org.keepcalm.models.WeatherResponse;
import org.keepcalm.service.WeatherService;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherTool {

    @Autowired
    private WeatherService weatherService;

    @Tool(name = "get_current_weather",
            description = "Get the current weather for a specified city.")
    public WeatherResponse getCurrentWeather(String city) {
        // Placeholder implementation
        return weatherService.getWeather(city);
    }
}
