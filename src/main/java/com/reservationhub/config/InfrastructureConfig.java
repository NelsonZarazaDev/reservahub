package com.reservationhub.config;

import com.reservationhub.reservation.config.ReservationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ReservationProperties.class)
public class InfrastructureConfig {

}
