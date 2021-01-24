package com.worldofmonster.characters;

//sub class, child class, derived class
public class Elf extends Monster {
	
	public Elf() {
		super(100, 70);
		this.name = "Elf";
	}

	private int mana;
	
	@Override
	public void attack() {
		System.out.println("Elf is attacking...");
	}
	
	public void magicAttack() {
		System.out.println("Elf is attacking magically..");
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
	
}
