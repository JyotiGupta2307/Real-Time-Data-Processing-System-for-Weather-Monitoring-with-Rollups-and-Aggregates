Real-Time Data Processing System for Weather Monitoring with Rollups and Aggregates

This project is a real-time data processing application designed to monitor weather conditions, generate alerts, and provide summary statistics. Built with Java, Spring Boot, Thymeleaf, and MySQL, it leverages the OpenWeatherMap API to fetch and process weather data for various cities, allowing users to view alerts, weather summaries, and more.
Features

    Real-Time Data Fetching: Fetches live weather data from the OpenWeatherMap API at regular intervals.
    Weather Alerts: Generates alerts if specific conditions are met, such as high temperatures.
    Daily Summary Statistics: Provides a summary including average, max, and min temperatures, along with the dominant weather condition.
    Email Notifications: Sends email alerts if weather conditions meet the criteria for an alert (e.g., consecutive high temperatures).
    Web Interface: Allows users to check weather alerts and summaries for selected cities via a user-friendly web interface.

Project Structure

    Controller: Handles API requests, returning JSON data and rendering web pages.
    Service: Contains business logic for fetching, processing, and storing weather data.
    Module: Defines data models, including WeatherData and WeatherSummary.
    Repository: Interfaces with MySQL to store and retrieve weather data.
    Resources/Templates: HTML files for the Thymeleaf views.

Prerequisites

    Java 11 or later
    MySQL (for data storage)
    Maven (for dependency management)
    Spring Boot (as the framework)
    OpenWeatherMap API Key (for fetching live weather data)

Setup Instructions

    Clone the Repository:
    git clone https://github.com/JyotiGupta2307/Real-Time-Data-Processing-System-for-Weather-Monitoring-with-Rollups-and-Aggregates.git
    cd Real-Time-Data-Processing-System-for-Weather-Monitoring-with-Rollups-and-Aggregates

Database Setup:

    Create a MySQL database named weather_app.
    Update application.properties with your MySQL credentials:

    properties

    spring.datasource.url=jdbc:mysql://localhost:3306/weather_app
    spring.datasource.username=your-username
    spring.datasource.password=your-password

Configure API Key:

    In application.properties, add your OpenWeatherMap API key:

    properties

    weather.api.key=YOUR_API_KEY
    weather.api.url=https://api.openweathermap.org/data/2.5/weather?q={CITY}&appid=YOUR_API_KEY

Run the Application:

    Start the Spring Boot application:

    bash

        mvn spring-boot:run

        The server will start at http://localhost:5959.

Usage
Web Interface

    Check Weather Alerts: Enter a city name and click "Check Alert" to see if there are any weather alerts for that city.
    View Daily Summary: Access daily summary information including max, min, and average temperature for a specific city.

API Endpoints

    Fetch Weather Data for All Cities: /weather/fetch
    Get Weather Summary for a City: /weather/summary?city={cityName}
    Check Weather Alert for a City: /weather/alert?city={cityName}

Configuration Options

    Scheduler Intervals: Update the intervals for data fetching and alert checks in application.properties.

    properties

weather.fetch.interval=300000  # Data fetch interval in ms (e.g., every 5 minutes)
weather.check.interval=300000  # Alert check interval in ms

Email Notifications: Configure your email credentials in application.properties to enable notifications.

properties

    spring.mail.username=your-email@gmail.com
    spring.mail.password=your-email-password

Built With

    Java & Spring Boot: Backend and API services
    Thymeleaf: Frontend templating engine
    MySQL: Data storage
    OpenWeatherMap API: Weather data provider

License

This project is licensed under the MIT License - see the LICENSE file for details.
Acknowledgments

    Original project inspiration from Jyoti Gupta.
    Weather data provided by OpenWeatherMap.
