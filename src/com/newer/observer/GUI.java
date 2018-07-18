package com.newer.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者（GUI）
 * @author lenovo
 *
 */
public class GUI implements Observer {
	
	private Model m;
	
	private CPUModel m2;
	
	public GUI(Model m,CPUModel m2) {
		this.m = m;
		this.m2 = m2;
	}

	@Override
	public void update(Observable o, Object arg) {
		
		if (o instanceof Model) {
			System.out.println("CLI price:" + m.getPirce());
		}
		
		if (o instanceof CPUModel) {
			if (arg.equals("total")) {
			System.out.println("CLI CpuModel total:" + m2.getTotal());	
			} else {
			System.out.println("CLI CpuModel other:" + m2.getOther());	
			}
		}
	}
	
}
