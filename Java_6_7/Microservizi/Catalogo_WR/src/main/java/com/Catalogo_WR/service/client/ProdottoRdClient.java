package com.Catalogo_WR.service.client;

import com.Catalogo_WR.dto.ProdottoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "catalogo-rd", url = "http://localhost:8081/prodotti")
public interface ProdottoRdClient {

    @GetMapping("/{id}")
    ProdottoDTO getProdottoById(@PathVariable("id") int id);
}