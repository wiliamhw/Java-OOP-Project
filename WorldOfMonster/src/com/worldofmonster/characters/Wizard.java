package com.worldofmonster.characters;

public class Wizard extends Monster {

	public Wizard()
	{
		super(100, 20);
	}
	
	public void attack() {
		System.out.println("Wizard is attacking...");
	}
	
}
