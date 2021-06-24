package com.coder.zt.game.game_handler_server;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import java.awt.Robot;

@SpringBootApplication
public class GameHandlerServerApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(GameHandlerServerApplication.class);
        builder.headless(false).run(args);
	}

	@Bean
    public Robot createRobot() {
		try {
			return new Robot();
		} catch (Exception e) {
			return null;
		}
        
    }
}
