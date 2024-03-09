package com.exa.spring.springframework.game;

public class MarioGame implements GameInterface{

	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Go into a hole");
	}
	
	public void left() {
		System.out.println("Go left");
	}
	
	public void right() {
		System.out.println("Accelerate");
	}
}
