package com.Catalogo_WR.exception;

import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalHandlerException {

    // 1. ID TROVATO (Ma con versione sbagliata -> Conflitto)
    @ExceptionHandler(OptimisticLockingFailureException.class)
    public ResponseEntity<Map<String, String>> handleConflict() {
        return new ResponseEntity<>(
                Map.of("messaggio", "ID trovato, ma i dati sono già stati modificati da altri."),
                HttpStatus.CONFLICT // 409
        );
    }

    // 2. ID NON TROVATO (Errore generico di risorsa mancante)
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, String>> handleNotFound(RuntimeException ex) {
        return new ResponseEntity<>(
                Map.of("messaggio", ex.getMessage()),
                HttpStatus.NOT_FOUND // 404
        );
    }
}