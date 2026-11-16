package com.reservationhub.organization.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

public record OrganizationResponse(
    UUID id,
    String name,
    String slug,
    boolean active,
    OffsetDateTime createdAt
){}
