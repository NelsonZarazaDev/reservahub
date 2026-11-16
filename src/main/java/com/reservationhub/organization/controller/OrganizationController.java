package com.reservationhub.organization.controller;

import com.reservationhub.organization.dto.CreateOrganizationRequest;
import com.reservationhub.organization.dto.OrganizationResponse;
import com.reservationhub.organization.service.OrganizationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("organization")
@RequiredArgsConstructor
public class OrganizationController {
    private final OrganizationService organizationService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrganizationResponse createOrganization(@RequestBody @Valid CreateOrganizationRequest createOrganizationRequest){
        return organizationService.createOrganization(createOrganizationRequest.name(), createOrganizationRequest.slug());
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public OrganizationResponse getOrganizationById(@PathVariable("id") UUID id){
        return organizationService.getOrganizationById(id);
    }
}
