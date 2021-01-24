package com.worldofmonster.characters;

//sub class, child class, derived class
public class Orc extends Monster {

	private int clubStrength;
	private Weapon weapon;
	
	public Orc() {
		super(100, 40);
		this.name = "Orc";
	}
	
	public void attack() {
		System.out.println("Orc is attacking...");
	}
	
	//overloading
	public void attack(int strength) {
		System.out.println("Monster is attacking using " + strength + " points");
	}
	
	public void clubAttack() {
		System.out.println("Orc is club attacking");
	}

	public int getClubStrength() {
		return clubStrength;
	}

	public void setClubStrength(int clubStrength) {
		this.clubStrength = clubStrength;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
}
