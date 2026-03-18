package com.Catalogo_RD.service.client;

import com.Catalogo_RD.dto.ProdottoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "catalogo-wr", url = "http://localhost:8080/prodotti")
public interface ProdottoWrClient {

    @PostMapping
    ProdottoDTO create(@RequestBody ProdottoDTO prodottoDTO);

    @PutMapping("/{id}")
    ProdottoDTO update(@PathVariable("id") int id, @RequestBody ProdottoDTO prodottoDTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") int id);
}