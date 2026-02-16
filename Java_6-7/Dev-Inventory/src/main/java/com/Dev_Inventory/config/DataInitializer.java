package com.Dev_Inventory.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Dev_Inventory.dto.ResourceDTO;
import com.Dev_Inventory.service.ResourceService;

@Component
public class DataInitializer implements CommandLineRunner{
	private final ResourceService service;
	
	public DataInitializer(ResourceService service) {
		this.service = service;
	}
	
	@Override
	public void run(String... args) throws Exception {
		ResourceDTO eclipse = new ResourceDTO(
			"1",
			"Eclipse IDE",
			"Ambiente di sviluppo standard per java",
			"https://www.eclipse.org",
			"IDE",
			null
		); 
		service.saveResource(eclipse);
		
		ResourceDTO spring = new ResourceDTO(
			"2",
			"Spring Boot",
			"Framework per creare microservizi Java",
			"https://spring.org",
			"Framework",
			null
		);
		service.saveResource(spring);
				
		
		System.out.println("--------------------------------");
        System.out.println("DATABASE INIZIALIZZATO CON SUCCESSO: 2 RISORSE...");
        System.out.println("--------------------------------");
	}

}
