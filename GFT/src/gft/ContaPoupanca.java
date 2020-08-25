package gft;

public class ContaPoupanca extends Conta{
	private double saldo;
	
	public ContaPoupanca(int numero, String titular, double saldo) {
		super(numero, titular, saldo);
		
	}
	

public double rendimento() {
		return this.getSaldo() * 0.05; 
	}

}
