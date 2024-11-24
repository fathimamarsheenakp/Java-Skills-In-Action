package com.kodnest.oops.abstraction;

public class BirdApp {

	public static void main(String[] args) {
		BirdKingdom birdKingdom = new BirdKingdom();
		birdKingdom.acceptBird(new GoldenEagle());
		birdKingdom.acceptBird(new SerpantEagle());
		birdKingdom.acceptBird(new MountainEagle());
		birdKingdom.acceptBird(new VegSparrow());
		birdKingdom.acceptBird(new NonVegSparrow());
		
	}
}
