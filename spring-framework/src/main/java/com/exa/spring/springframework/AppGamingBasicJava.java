package com.exa.spring.springframework;

import com.exa.spring.springframework.game.TightGameRunner;
import com.exa.spring.springframework.game.LooseGameRunner;
import com.exa.spring.springframework.game.MarioGame;
import com.exa.spring.springframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		var game = new MarioGame();
		//var game = new SuperContraGame();
		
		//var gameRunner = new TightGameRunner(game);
		var gameRunner = new LooseGameRunner(game);
		gameRunner.run();

	}

}
