package com.example.weather_monitoring.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Alerts")
public class AlertDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "City can't be null")
    private String city;

    private boolean alertTriggered;
    private String alertMessage;

    public AlertDTO() {
    }

    public AlertDTO(String city, boolean alertTriggered, String alertMessage) {
        this.city = city;
        this.alertTriggered = alertTriggered;
        this.alertMessage = alertMessage;
    }
}
