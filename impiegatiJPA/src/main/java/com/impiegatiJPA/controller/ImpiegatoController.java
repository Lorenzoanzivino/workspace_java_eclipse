package com.impiegatiJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PatchExchange;

import com.impiegatiJPA.dto.ImpiegatoDTO;
import com.impiegatiJPA.service.ImpiegatoService;

@RestController
@RequestMapping("/impiegati")
public class ImpiegatoController {

    @Autowired
    private ImpiegatoService impiegatoService;
    
    // POST → assumi nuovo impiegato
    // GET → cerca per matricola
    // GET → visualizza tutti
    // PATCH → modifica salario
    // DELETE → cancella

    @PostMapping
    public ImpiegatoDTO assumi(@RequestBody ImpiegatoDTO impDTO) {
        return impiegatoService.assumi(impDTO);
    }
    
    @GetMapping("/{matricola}")
    public ImpiegatoDTO cerca(@PathVariable int matricola) {
        return impiegatoService.cercaPerMatricola(matricola);
    }
    
    // Visualizza tutti gli impiegati
    @GetMapping
    public List<ImpiegatoDTO> visualizzaTutti() {
        return impiegatoService.visualizzaTutti();
    }

    // Modifica il salario di un impiegato (PATCH/PUT)
    @PatchExchange("/{matricola}")
    public ImpiegatoDTO modifica(@PathVariable int matricola, @RequestParam double nuovoSalario) {
        return impiegatoService.modifica(matricola, nuovoSalario);
    }
    
    @DeleteMapping("/{matricola}")
    public ImpiegatoDTO cancella(@PathVariable int matricola) {
        return impiegatoService.cancella(matricola);
    }
}
