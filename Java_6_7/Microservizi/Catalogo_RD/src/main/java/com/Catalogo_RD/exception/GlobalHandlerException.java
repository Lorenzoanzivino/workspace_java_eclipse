package com.Catalogo_RD.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalHandlerException {

    // Questo metodo scatta automaticamente ogni volta che viene lanciata una RuntimeException
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, String>> handleRuntimeException(RuntimeException ex) {

        // Creiamo un corpo della risposta in formato JSON (chiave-valore)
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("errore", "Risorsa non trovata");
        errorResponse.put("messaggio", ex.getMessage());

        // Restituiamo il JSON con lo Status Code 404 (Not Found)
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    // Qui in futuro potrai aggiungere altri metodi per gestire eccezioni diverse
    // (es. @ExceptionHandler(MethodArgumentNotValidException.class) per gli errori di validazione e restituire 400 Bad Request)
}