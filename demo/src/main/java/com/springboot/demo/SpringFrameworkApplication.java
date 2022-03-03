package com.springboot.demo;

import com.springboot.demo.game.GameRunner;
import com.springboot.demo.game.MarioGame;
import com.springboot.demo.game.SuperContractGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =
				SpringApplication.run(SpringFrameworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);


//		MarioGame game = new MarioGame();

//		SuperContractGame game = new SuperContractGame();
//		GameRunner runner = new GameRunner(game);

		runner.runGame();


	}

}
