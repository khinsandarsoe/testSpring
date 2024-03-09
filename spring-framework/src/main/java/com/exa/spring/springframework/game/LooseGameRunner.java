package com.exa.spring.springframework.game;

public class LooseGameRunner {
	
	private GameInterface game;
	
	public LooseGameRunner(GameInterface game) { //tightly coupling with SuperContraGame
		this.game = game;
    }

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
		System.out.println("Running Game: " + game);
		
	}

}
