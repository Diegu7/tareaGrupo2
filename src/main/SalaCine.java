package main;

public class SalaCine {
	public Ticket arrTicket[][] = new Ticket[10][30];
	public int ticketsVendidos = 0;
	
	public void arrDec(){
		for(int f = 0; f < arrTicket.length; f++){
			for(int c = 0; c < arrTicket[f].length; c++){
				arrTicket[f][c] = new Ticket(f,c);
			}
		}
	}
	
	private void reset(int f, int c){
		System.out.println(f + " asdasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa " + c);
		System.out.println(arrTicket.length);
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
		
	}
	
	public void printSala(){
		
	}
}
