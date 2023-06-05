package br.com.fiap.energy.exception;

import java.time.LocalDateTime;

public record ApiErrorResponse (
    String message,
    LocalDateTime timestamp,
    int statusCode,
    String statusCodeMessage
) {}
