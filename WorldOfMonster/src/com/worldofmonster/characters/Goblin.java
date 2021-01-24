package com.worldofmonster.characters;

//sub class, child class, derived class
public class Goblin extends Monster {

	public Goblin() {
		super(100, 70);
		this.name = "Goblin";
	}

	private int thiefSkill;
	
	public void attack() {
		System.out.println("Goblin is attacking...");
	}
	
	public void stealMoney() {
		System.out.println("Goblin is stealing your money");
	}

	public int getThiefSkill() {
		return thiefSkill;
	}

	public void setThiefSkill(int thiefSkill) {
		this.thiefSkill = thiefSkill;
	}
	
}
