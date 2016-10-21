package main;

import java.util.Calendar;

public class Ticket {
	public int ref;
	public Calendar fecha;
	public double precio;
	
	public Ticket(int r, double p){
		ref = r;
		precio = p;
		fecha = Calendar.getInstance();
	}
}
