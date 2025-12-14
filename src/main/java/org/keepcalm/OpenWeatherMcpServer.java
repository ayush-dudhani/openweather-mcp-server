package org.keepcalm;

import org.keepcalm.tools.WeatherTool;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OpenWeatherMcpServer {

    public static void main(String[] args) {
        SpringApplication.run(OpenWeatherMcpServer.class, args);
    }

    @Bean
    public ToolCallbackProvider stockTools(WeatherTool weatherTool) {
        return MethodToolCallbackProvider.builder().toolObjects(weatherTool).build();
    }

}
