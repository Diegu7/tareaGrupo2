package main;

import java.util.Scanner;

public class MainPro {
	
	public static SalaCine lol = new SalaCine();
	private static Scanner scan; 
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		lol.arrDec();
		int choice = 0;
		do{
			System.out.println("---------------------\n1-Nuevo Ticket\n2-Print Sala\n3-Cancelar Ticket\n4-Cerrar evento\n5-Cerrar\n-");
			choice = scan.nextInt();
			switch(choice){
			case 1:
				String cliente = scan.next();
				int f = scan.nextInt();
				int c = scan.nextInt();
				lol.sellTicket(cliente, f, c);
				break;
			case 2:
				lol.printSala();
				break;
			case 3:
				int t = scan.nextInt();
				lol.cancelTicket(t);
				break;
			case 4:
				lol.eventClose();
				break;
			default:
				break;
			}
		}while(choice != 5);
		
	}
}
