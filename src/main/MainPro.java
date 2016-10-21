package main;

public class MainPro {
	
	public static SalaCine lol = new SalaCine(); 
	public static void main(String[] args) {
		
		lol.arrDec();
		
		for(int f = 0; f < lol.arrTicket.length; f++){
			for(int c = 0; c < lol.arrTicket[f].length; c++){
				lol.arrTicket[f][c].print();
			}
		}
		
		lol.reset();
		
		for(int f = 0; f < lol.arrTicket.length; f++){
			for(int c = 0; c < lol.arrTicket[f].length; c++){
				lol.arrTicket[f][c].print();
			}
		}
		
		
		
	}
}
