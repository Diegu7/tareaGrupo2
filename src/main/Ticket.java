package main;

import java.text.SimpleDateFormat;
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
	
	public Ticket(int r, double p, Calendar c){
		ref = r;
		precio = p;
		fecha = c;
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
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yy");
		String formatted = format1.format(fecha.getTime());
		System.out.print(ref + " - " + precio + " - " + formatted);
	}
}

