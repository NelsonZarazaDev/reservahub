package com.reservationhub.organization.exception;

import java.util.UUID;

public class OrganizationNotFoundException extends RuntimeException{
    public OrganizationNotFoundException(UUID id) {
        super("No organization with ID: "+id);
    }
}
