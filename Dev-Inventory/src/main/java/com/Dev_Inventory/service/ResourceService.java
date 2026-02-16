package com.Dev_Inventory.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.Dev_Inventory.dto.ResourceDTO;
import com.Dev_Inventory.entity.Resource;
import com.Dev_Inventory.repository.ResourceRepository;

@Service
public class ResourceService {
	
	private final ResourceRepository repository;
	
	public ResourceService(ResourceRepository repository) {
		this.repository = repository;
	}
	
	public ResourceDTO saveResource(ResourceDTO dto) {
		Resource entity = convertToEntity(dto);
		Resource saveEntity = repository.save(entity);
		return convertToDto(saveEntity);
	}
	
	public List<ResourceDTO> getAllResources(){
		return repository.findAll()
				.stream()
				.map(this::convertToDto)
				.collect(Collectors.toList());
	}
	
	public ResourceDTO getResourceById(String id) {
		return repository.findById(id)
                .map(this::convertToDto)
                .orElseThrow(() -> new RuntimeException("Risorsa non trovata con ID: " + id));
    }
	
	public void delete(String id) {
	    if (!repository.existsById(id)) {
	        throw new RuntimeException("Impossibile eliminare: Risorsa non trovata");
	    }
	    repository.deleteById(id);
	}

	private Resource convertToEntity(ResourceDTO dto) {
		if (dto == null) return null;
		return new Resource(
				dto.getId(),
				dto.getNome(),
				dto.getDescrizione(),
				dto.getUrl(),
				dto.getCategoria()
				);
	}
	
	private ResourceDTO convertToDto(Resource entity) {
		if (entity == null) return null;
		return new ResourceDTO(
				entity.getId(),
				entity.getNome(),
				entity.getDescrizione(),
				entity.getUrl(),
				entity.getCategoria(),
				entity.getDataInserimento()
				);
	}


}
