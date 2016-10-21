package main;

import java.util.Calendar;

public class SalaCine {
	public Ticket arrTicket[][] = new Ticket[10][30];
	public int ticketsVendidos = 0;
	
	public void arrDec(){
		for(int f = 0; f < arrTicket.length; f++){
			for(int c = 0; c < arrTicket[f].length; c++){
				arrTicket[f][c] = new Ticket(0,0,null);
			}
		}
	}
	
	public Coordenada searchTicketByReference(int number, int fila,int columna){
        if(fila<=arrTicket.length){
            if(columna <= arrTicket[fila].length){
                if(arrTicket[fila][columna].getRef()==number)
                    return new Coordenada(fila,columna);
                return searchTicketByReference(number,fila,columna+1); 
            }
            searchTicketByReference(number,fila+1,1);
        }
        return null;
    }
	
	private double income(int f, int c, double inc){
		if(f < arrTicket.length){
			if(c < arrTicket[f].length){
				inc = inc + + arrTicket[f][c].getPrecio();
				return income(f, c+1, inc);
			}
			return income(f+1, 0, inc);
		}
		return 0;
	}
	
	public double income(){
		return income(0,0,0);
	}
	
	private boolean isPalindromo(String name, int contador1,int contador2){
	       if(name.length()>contador1){
	          if(name.charAt(contador1)== name.charAt(name.length()-contador2))
	              isPalindromo(name,contador1+1,contador2+1);
	          else
	              return false;
	       }
	       return true;
	   }


	public boolean isPalindromo(String name){
	    return this.isPalindromo(name, 0, 1);
	 }
	
	private void reset(int f, int c){
		if(f < arrTicket.length){
			if(c < arrTicket[f].length){
				arrTicket[f][c].setRef(0);
				arrTicket[f][c].setFecha(null);
				arrTicket[f][c].setPrecio(0);
				reset(f, c+1);
				return;
			}
			reset(f+1, 0);
		}
	}
	
	public void reset(){
		ticketsVendidos = 0;
		reset(0, 0);
	}
	
	public void sellTicket(String cliente, int numFila, int numCol){
		if(arrTicket[numFila][numCol].getFecha() != null){
			System.out.println("Asiento ocupado sry");
			return;
		}
		ticketsVendidos++;
		int precio = 100;
		Calendar hoy = Calendar.getInstance();
		int dia = hoy.get(Calendar.DAY_OF_WEEK);
		if(dia == Calendar.TUESDAY)
			precio = 50;
		else if(dia == Calendar.THURSDAY && isPalindromo("test")){
			precio = 70;
		}
		arrTicket[numFila][numCol] = new Ticket(ticketsVendidos, precio);
	}
	
	private void printSala(int f, int c){
		if(f < arrTicket.length){
			if(c < arrTicket[f].length){
				if(arrTicket[f][c].getFecha() == null){
					System.out.print("[*D I S P O N I B L E]");
					printSala(f, c+1);
					return;
				}
				System.out.print("[");
				arrTicket[f][c].print();
				System.out.print("]");
				printSala(f, c+1);
				return;
			}
			System.out.println();
			printSala(f+1, 0);
		}
	}
	
	public void printSala(){
		printSala(0,0);
	}
	
	public boolean cancelTicket(int number){
		for(int f = 0; f < arrTicket.length; f++){
			for(int c = 0; c < arrTicket[f].length; c++){
				if(arrTicket[f][c].getRef() == number){
					arrTicket[f][c].setRef(0);
					arrTicket[f][c].setFecha(null);
					arrTicket[f][c].setPrecio(0);
					return true;
				}
			}
		}
		return false;
    }

    public void eventClose(){
    	double total = 0;
    	for(int f = 0; f < arrTicket.length; f++){
			for(int c = 0; c < arrTicket[f].length; c++){
				total = total + arrTicket[f][c].getPrecio();
			}
		}
    	System.out.println("INGRESOS TOTALES: " + total);
    	reset();
    }
}
