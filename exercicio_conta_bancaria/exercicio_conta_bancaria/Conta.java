package exercicio_conta_bancaria;

public class Conta {
	
	private double saldo; // o saldo é privado pois ninguém de fora da classe deve interferir nele
	
	public Conta(double saldoInicial) {  // construtor, é o método que vai criar o objeto baseado na entidade "Conta"
		if(saldoInicial <0) {
			throw new IllegalArgumentException("Não é possível criar uma conta com saldo inicial negativo.");
		}
		this.saldo = saldoInicial;
	}
	
	// os métodos sacar e depositar são public pois quem é de fora pode mexer no saldo através deles e de suas regras
	
	public void depositar(double deposito) {
		
		if(deposito <=0) {
			System.out.println("Não é possível depositar valores negativos ou nulos.");
		}else {
			saldo = saldo + deposito;
		}
	}
	
	public void sacar(double saque){
		if(saque<=0) {
			System.out.println("Não é possível realizar esta ação.");
		}
		else if(saque > saldo) {
				System.out.println("Saldo insuficiente.");
		}else {
				saldo = saldo - saque;
			}
		}
	
	public double getSaldo() {		// esse é o famoso "getter", serve para exibir o saldo, apenas
		return this.saldo;
	}
		
}