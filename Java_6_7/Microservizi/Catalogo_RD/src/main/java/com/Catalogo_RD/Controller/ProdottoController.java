package com.Catalogo_RD.controller;

import com.Catalogo_RD.dto.ProdottoDTO;
import com.Catalogo_RD.service.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prodotti")
public class ProdottoController {

    private final ProdottoService prodottoService;

    @Autowired
    public ProdottoController(ProdottoService prodottoService) {
        this.prodottoService = prodottoService;
    }

    @GetMapping
    public ResponseEntity<List<ProdottoDTO>> getAllProdotti() {
        List<ProdottoDTO> prodotti = prodottoService.findAll();
        return ResponseEntity.ok(prodotti);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdottoDTO> getProdottoById(@PathVariable int id) {
        ProdottoDTO prodotto = prodottoService.findById(id);
        return ResponseEntity.ok(prodotto);
    }
}