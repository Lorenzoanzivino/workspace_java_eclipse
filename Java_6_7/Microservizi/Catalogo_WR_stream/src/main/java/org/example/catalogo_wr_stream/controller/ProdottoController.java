package org.example.catalogo_wr_stream.controller;

import org.example.catalogo_wr_stream.dto.ProdottoDTO;
import org.example.catalogo_wr_stream.service.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prodotti")
public class ProdottoController {

    private final ProdottoService service;

    @Autowired
    public ProdottoController(ProdottoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ProdottoDTO> create(@RequestBody ProdottoDTO dto) {
        return new ResponseEntity<>(service.create(dto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdottoDTO> update(@PathVariable int id, @RequestBody ProdottoDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ProdottoDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdottoDTO> findById(@PathVariable int id) {
        return ResponseEntity.ok(service.findById(id));
    }
}