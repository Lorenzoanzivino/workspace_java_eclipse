package com.spring.music;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.music.entity.Player;

@SpringBootApplication
public class SpringDepInjApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDepInjApplication.class, args);
		Player player = context.getBean(Player.class);
		
		player.playInstrument();
	}

}
