package com.Catalogo_RD.exception;

public class IdNonTrovatoException extends RuntimeException {
    public IdNonTrovatoException(String messaggio) {
        super(messaggio);
    }
}