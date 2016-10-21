package main;

import java.util.Calendar;

public class Ticket {
	private int ref;
	private Calendar fecha;
	private double precio;
	
	public Ticket(int r, double p){
		ref = r;
		precio = p;
		fecha = Calendar.getInstance();
	}
	
	public int getRef(){
		return ref;
	}
	
	public Calendar getFecha(){
		return fecha;
	}
	
	public double getPrecio(){
		return precio;
	}
	
	public void setRef(int r){
		ref = r;
	}
	
	public void setFecha(Calendar f){
		fecha = f;
	}
	
	public void setPrecio(double p){
		precio = p;
	}
	
	public void print(){
		System.out.println(ref + " - " + precio + " - " + fecha);
	}
}

