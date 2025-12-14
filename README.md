# openweather-mcp-server

Lightweight Spring Boot MCP server exposing OpenWeather data and an SSE (Server-Sent Events) transport for MCP clients.

## Features

- Spring Boot (Java / Maven) service
- SSE endpoint for MCP clients: `GET /sse`
- Configurable OpenWeather API key and base URL

## Prerequisites

- Java 17+ (or project JDK)
- Maven 3.6+
- OpenWeather API key

## Configuration

Set environment variables (or use a `.env` loader in your environment):

- `OPENWEATHER.API.KEY` — Your OpenWeather API key
- `OPENWEATHER.BASE.URL` — OpenWeather base URL (example: `https://api.openweathermap.org/data/2.5/weather`)
