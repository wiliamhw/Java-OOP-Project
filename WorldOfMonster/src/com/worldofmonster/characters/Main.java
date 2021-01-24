package com.worldofmonster.characters;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orc orc = new Orc();
		
		System.out.println(orc.getHealthPoint());
		System.out.println(orc.getSpeed());
		System.out.println(orc.getLevel());
		orc.walk();
		orc.attack();
		orc.clubAttack();
		
		Monster m = new Monster();

		

	}

}
