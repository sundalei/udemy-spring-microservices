package com.example.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AppExceptionsHandler extends ResponseEntityExceptionHandler {
    
    @ExceptionHandler
    public ResponseEntity<Object> handleAnyException(Exception ex) {
        return new ResponseEntity<>("error happened", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
