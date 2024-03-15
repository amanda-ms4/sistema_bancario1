package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;


public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	

		Conta cliente;

		
		
		System.out.print("Enter account number: ");
		int numero_conta = sc.nextInt();
		System.out.print("Enter account holder:");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)?");
		char option = sc.next().charAt(0);
		
		
		
		if(option == 'y') {
			System.out.print("Enter initial deposit value:");
			double saldo = sc.nextDouble();
			cliente = new Conta(numero_conta, titular, saldo);	
		}
		else {
			cliente = new Conta(numero_conta,titular);
		}

		
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(cliente);
				
		
		System.out.println();
		System.out.print("Enter a deposit value:");
		double depositValue = sc.nextDouble();
		cliente.addSaldo(depositValue);
		
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(cliente);
		
		
		System.out.println();
		System.out.print("Enter a withdraw value:");
		double withdrawValue = sc.nextDouble();
		cliente.removerSaldo(withdrawValue);
	
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(cliente);
		

		
		sc.close();
		
	}

	
	
	
}
