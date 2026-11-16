package com.reservationhub.common.exception;

import com.reservationhub.organization.exception.OrganizationAlreadyExistsException;
import com.reservationhub.organization.exception.OrganizationNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler{

    @ExceptionHandler(OrganizationAlreadyExistsException.class)
    public ProblemDetail handleOrganizationAlreadyExists(OrganizationAlreadyExistsException oaee){
        return ProblemDetail.forStatusAndDetail(HttpStatus.CONFLICT, oaee.getMessage());
    }

    @ExceptionHandler(OrganizationNotFoundException.class)
    public ProblemDetail handleOrganizationNotFound(OrganizationNotFoundException onfe){
        return ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, onfe.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ProblemDetail handleValidationException(MethodArgumentNotValidException exception){
        String detail = exception.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(error -> error.getField()
                        + ": " + error.getDefaultMessage()).collect(Collectors.joining("; "));
        return ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, detail);
    }
}
