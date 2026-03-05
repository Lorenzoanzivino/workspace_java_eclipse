package com.Catalogo_WR.exception;

public class IdNonTrovatoException extends RuntimeException {
    public IdNonTrovatoException(String messaggio) {
        super(messaggio);
    }
}