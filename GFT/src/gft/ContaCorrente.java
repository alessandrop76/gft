package gft;

public class ContaCorrente extends Conta{
	private double saldo;
	
	public ContaCorrente(int numero, String titular, double saldo) {
		super(numero, titular, saldo);
		this.saldo = saldo;
	}
	
public double rendimento() {
		return this.getSaldo() * 0.03; 
	}
	
public String toString() {
	this.numero()+""+this.getTitular()+""+saldo;
}
}
