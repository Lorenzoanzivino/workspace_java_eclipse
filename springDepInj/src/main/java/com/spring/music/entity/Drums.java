package com.spring.music.entity;

import org.springframework.stereotype.Component;

@Component
public class Drums implements Instrument {
	
	@Override
	public void play(){
		System.out.println("Sto suonando la Batteria");
	}
}
