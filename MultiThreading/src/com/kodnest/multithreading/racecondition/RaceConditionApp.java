package com.kodnest.multithreading.racecondition;

public class RaceConditionApp {
	public static void main(String[] args) {
		MSWord msWord = new MSWord();
		
		Thread typeThread = new Thread(msWord);
		Thread spellThread = new Thread(msWord);
		Thread saveThread = new Thread(msWord);
		
		typeThread.setName("type");
		spellThread.setName("spell");
		saveThread.setName("save");
		
		spellThread.setDaemon(true);
		saveThread.setDaemon(true);
		
		spellThread.setPriority(8);
		saveThread.setPriority(10);
		
		typeThread.start();
		spellThread.start();
		saveThread.start();
	}
}
