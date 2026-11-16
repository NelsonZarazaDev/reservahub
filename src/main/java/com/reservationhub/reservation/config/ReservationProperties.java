package com.reservationhub.reservation.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("reservationhub.reservations")
public class ReservationProperties {
    private int maxPerCustomer;

    public int getMaxPerCustomer() {
        return maxPerCustomer;
    }

    public void setMaxPerCustomer(int maxPerCustomer) {
        this.maxPerCustomer = maxPerCustomer;
    }
}