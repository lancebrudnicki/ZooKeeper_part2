package com.zookeeper_part2;

public class Mammals {
	int energyLevel;
	
	
	
	//gives the default value of 100 energy
	public Mammals() {
		this(100);
	}
	
	
	// takes an input for an energy level 
	public Mammals(int energyLevelParam) {
		energyLevel = energyLevelParam;
	}
	
	
	//return the Mammals energy
	public int displayEnergy () {
		return energyLevel;
	}
}
