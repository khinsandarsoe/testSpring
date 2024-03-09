package com.exa.spring.springframework.game;

public class TightGameRunner {
	
	//MarioGame game;
	SuperContraGame game;

	/*public GameRunner(MarioGame game) { //tightly coupling with marioGame
		this.game = game;
	}*/
	
	public TightGameRunner(SuperContraGame game) { //tightly coupling with SuperContraGame
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
