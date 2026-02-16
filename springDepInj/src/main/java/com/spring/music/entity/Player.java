package com.spring.music.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player {

	@Autowired
	private Instrument instrument;
	
	public void playInstrument() {
		instrument.play();
		
	}

}
