package com.sda.Quiz.Game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.sda.Quiz.Game.entities")
public class QuizGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizGameApplication.class, args);
	}

}
