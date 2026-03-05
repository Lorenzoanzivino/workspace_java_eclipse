package com.Catalogo_WR.controller;

import com.Catalogo_WR.dto.ProdottoDTO;
import com.Catalogo_WR.service.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prodotti")
public class ProdottoController {

    private final ProdottoService prodottoService;

    @Autowired
    public ProdottoController(ProdottoService prodottoService) {
        this.prodottoService = prodottoService;
    }

    @PostMapping
    public ResponseEntity<ProdottoDTO> createProdotto(@RequestBody ProdottoDTO prodottoDTO) {
        ProdottoDTO creato = prodottoService.create(prodottoDTO);
        // Restituiamo 201 Created quando una nuova risorsa viene generata con successo
        return new ResponseEntity<>(creato, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdottoDTO> updateProdotto(@PathVariable int id, @RequestBody ProdottoDTO prodottoDTO) {
        ProdottoDTO aggiornato = prodottoService.update(id, prodottoDTO);
        return ResponseEntity.ok(aggiornato);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProdotto(@PathVariable int id) {
        prodottoService.delete(id);
        // Restituiamo 204 No Content perché l'operazione è andata a buon fine ma non c'è corpo di risposta
        return ResponseEntity.noContent().build();
    }
}