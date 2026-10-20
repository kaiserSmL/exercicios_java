package exercicio_pessoa;

public class Main {
	public static void main() {
		Pessoa joao = new Pessoa("João", -8);    // objeto retornando erro pois a idade é negativa
		Pessoa maria = new Pessoa("Maria", 67);
		Pessoa francis = new Pessoa("Francisco", 67);
		Pessoa nul = new Pessoa("", 4);			// objeto retornando erro pois o nome é isBlank().
		
		System.out.println("Olá, " + joao.getNome() + "! Você tem " + joao.getIdade() + " anos.");
		System.out.println("Olá, " + maria.getNome() + "! Você tem " + maria.getIdade() + " anos.");
		System.out.println("Olá, " + francis.getNome() + "! Você tem " + francis.getIdade() + " anos.");
		System.out.println("Olá, " + nul.getNome() + "! Você tem " + nul.getIdade() + " anos.");
		
	}

}
