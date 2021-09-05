package com.observer;

public class Main {

	public static void main(String[] args) {
		ParcelOffice po = new ParcelOffice();
		Person james = new Person("James");
		Person lydin = new Person("Lydin");
		Person Jesicca = new Person("Jessica");
		Parcels p = new Parcels("Lydin","Swedan","Hi...You got a Parcel");
		
		po.Attach(james);
		po.Attach(lydin);
		po.Attach(Jesicca);
		
		po.AddParcel(p);
	}
}