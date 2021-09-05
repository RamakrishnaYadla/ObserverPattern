package com.observer;

import java.util.ArrayList;

public class ParcelOffice implements Item{

	private ArrayList<Parcels> parcels;
	private ArrayList<Observer> Obs;
	
	public ParcelOffice() {
		parcels = new ArrayList();
		Obs = new ArrayList();
	}
	
	public void AddParcel(Parcels p) {
		parcels.add(p);
		Notify();
	}
	
	public ArrayList<Parcels> getStatus(){
		return parcels;
	}
	
	public void Attach(Observer o) {
		Obs.add(o);
	}
	
	public void Dettach(Observer o) {
		Obs.remove(o);
	}
	
	public void Notify() {
		for(int i=0; i<Obs.size();i++) {
			Obs.get(i).update(this);
		}
	}
}
