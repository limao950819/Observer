package com.newer.observer;

public class App {
	
	public static void main(String[] args) {
		
		Model m = new Model();
		CPUModel m2 = new CPUModel();
		
		GUI gui = new GUI(m, m2);
		
		m.addObserver(gui);
		m2.addObserver(gui);
		
		m.setPirce(100);
		
	}

}
