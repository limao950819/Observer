package com.newer.observer;

import java.util.Observable;

public class CPUModel extends Observable{
	
	private int total;
	private int other;
	
	public void CPUModel(int total,int other) {
		this.total = total;
		this.other = other;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
		setChanged();
		notifyObservers();
	}

	public int getOther() {
		return other;
	}

	public void setOther(int other) {
		this.other = other;
		setChanged();
		notifyObservers();
	}
	
}
