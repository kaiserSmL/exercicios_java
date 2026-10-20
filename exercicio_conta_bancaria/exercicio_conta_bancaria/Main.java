package exercicio_conta_bancaria;
import java.util.Scanner;


public class Main {
	public static void main() {
		Scanner input = new Scanner(System.in);
		
		Conta corrente = new Conta(-10);
		
		System.out.println("Quanto deseja depositar?");
		corrente.depositar(input.nextDouble());
		System.out.println("Saldo atual : " + corrente.getSaldo());
		
		System.out.println("Quanto deseja sacar?");
		corrente.sacar(input.nextDouble());
		System.out.println("Saldo atual : " + corrente.getSaldo());
		
		
	}
}