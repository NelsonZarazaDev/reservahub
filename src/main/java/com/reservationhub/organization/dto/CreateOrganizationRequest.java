package com.reservationhub.organization.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// record se usa para crear clases de datos inmutables
public record CreateOrganizationRequest(
        @NotBlank
        @Size(max = 150, message = "MAX_150")
        String name,

        @NotBlank
        @Size(max = 100, message = "MAX_100")
        String slug
) { }
