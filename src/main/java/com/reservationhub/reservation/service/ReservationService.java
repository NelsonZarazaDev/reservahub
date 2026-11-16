package com.reservationhub.reservation.service;

import com.reservationhub.reservation.config.ReservationProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationProperties reservationProperties;

    public int getMaxReservationsPerCustomer(){
        return reservationProperties.getMaxPerCustomer();
    }
}
