package com.hdfc.employeeapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<?> employeeNotFoundExceptionHandler(EmployeeNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<?> DefaultHandlerException(NumberFormatException ex) {
        return new ResponseEntity<>("Enter the EmployeeId in number format only", HttpStatus.BAD_REQUEST);
    }
}
