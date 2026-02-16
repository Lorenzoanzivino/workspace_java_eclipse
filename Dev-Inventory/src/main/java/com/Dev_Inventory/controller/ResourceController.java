package com.Dev_Inventory.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dev_Inventory.dto.ResourceDTO;
import com.Dev_Inventory.service.ResourceService;

@RestController
@RequestMapping(path="/api/resources", produces="application/json")
public class ResourceController {
    
    private final ResourceService service;
    
    public ResourceController(ResourceService service) {
        this.service = service;
    }
    
    // Rimosso /api/Resources perché è già ereditato dalla classe
    @PostMapping(consumes="application/json")
    public ResourceDTO saveResource(@RequestBody ResourceDTO r) {
        return service.saveResource(r);
    }
    
    @GetMapping
    public List<ResourceDTO> getAllResources(){
        return service.getAllResources();
    }
    
    @GetMapping("/{id}")
    public ResourceDTO getResourceById(@PathVariable String id) {
        return service.getResourceById(id);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}