package com.observer;

public interface Item {

	void Attach(Observer o);
	void Dettach(Observer o);
	void Notify();
}
