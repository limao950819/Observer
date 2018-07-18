package com.newer.observer;

import java.util.Observable;

public class Model extends Observable{
	
	private int pirce;

//	public Model() {
//		super();
//	}
	
	public void Model(int price) {
		this.pirce = price;
	}

	public int getPirce() {
		return pirce;
	}

	public void setPirce(int pirce) {
		this.pirce = pirce;
		setChanged();
		notifyObservers("price");
	}
	
}
