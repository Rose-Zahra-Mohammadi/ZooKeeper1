package com.rosezahramohammadi.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla gorilla1 = new Gorilla(100);
		gorilla1.getEnergyLevel();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.getEnergyLevel();
		gorilla1.eatBananas();
		gorilla1.getEnergyLevel();
		gorilla1.climb();
		gorilla1.getEnergyLevel();
	}

}
