package entities;

public class Conta {

	
	private int numero_conta;
	private String titular;
	private double saldo;
	
	
	
	
	public Conta() {
	}
	
	
	public Conta(int numero_conta, String titular, double saldo) {
	
		this.numero_conta = numero_conta;
		this.titular = titular;
		this.saldo = saldo;
	}

	
	public Conta(int numero_conta, String titular) {
		
		this.numero_conta = numero_conta;
		this.titular = titular;
	}

	

	public int getNumero_conta() {
		return numero_conta;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void addSaldo(double saldo) {
		this.saldo += saldo;
	}
	
	
	public void removerSaldo (double saldo) {
	   this.saldo = this.saldo - saldo - 5.00  ;
   }
	
	
	
	
	public String toString() {
		return
		 "Número da conta: "
		+ numero_conta
		+ ", Titular: "
		+ titular
		+ ", Saldo:R$ "
		+ String.format("%.2f", saldo);
	
		}
	
	
	

	
}
