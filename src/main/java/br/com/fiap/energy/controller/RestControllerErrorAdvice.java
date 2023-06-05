package br.com.fiap.energy.controller;

import static java.util.stream.Collectors.joining;

import java.time.LocalDateTime;

import br.com.fiap.energy.exception.ApiErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestControllerErrorAdvice {
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        var message = exception
            .getAllErrors()
            .stream()
            .map(ObjectError::getDefaultMessage)
            .collect(joining("\n"));

        var errorResponse = new ApiErrorResponse(
            message, 
            LocalDateTime.now(), 
            HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase());

        return ResponseEntity.badRequest().body(errorResponse);
    }
}
