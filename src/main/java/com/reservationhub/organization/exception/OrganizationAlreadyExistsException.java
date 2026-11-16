package com.reservationhub.organization.exception;

public class OrganizationAlreadyExistsException extends RuntimeException{

    public OrganizationAlreadyExistsException(String slug){
        super("An organization with slug '" + slug + "' already exists.");
    }
}
