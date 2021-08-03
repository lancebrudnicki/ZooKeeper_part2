package com.zookeeper_part2;


class Bat extends Mammals {

	public Bat() {
		energyLevel = 300;
	}
	
	public void fly() {
		energyLevel -= 50;
		System.out.println("*flap* *flap*");
	}
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("Your a Monster......arrrar ahhhhh");
	}
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("BURN BABY.....BURN!!!!!");
	}
}
