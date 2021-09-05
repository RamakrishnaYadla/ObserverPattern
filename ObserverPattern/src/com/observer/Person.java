package com.observer;

import java.util.ArrayList;

public class Person implements Observer{
	
	String name;
	
	public Person(String name) {
		this.name = name;
	}

	public void checkParcel(ArrayList<Parcels> Parcel) {
		for(int i=0; i<Parcel.size();i++) {
			if(name.compareTo(Parcel.get(i).receiverName) == 0) {
				System.out.println(name+","+Parcel.get(i).info);
			}
		}
	}
	
	public void update(Object o) {
		if(o instanceof ParcelOffice) {
			ParcelOffice p = (ParcelOffice) o;
			checkParcel(p.getStatus());
		}
	}

}
