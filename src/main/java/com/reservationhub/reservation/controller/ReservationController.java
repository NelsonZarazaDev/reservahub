package com.reservationhub.reservation.controller;

import com.reservationhub.reservation.dto.ReservationPolicyResponse;
import com.reservationhub.reservation.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/reservations")
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationService reservationService;

    @GetMapping(path = "/policy")
    public ReservationPolicyResponse getReservationPolicy(){
        return new ReservationPolicyResponse(reservationService.getMaxReservationsPerCustomer());
    }
}
