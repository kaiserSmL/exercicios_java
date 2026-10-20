package exercicio_pessoa;

public class Pessoa {
	
	private int idade;
	private String nome;
	
	public Pessoa(String nomeInicial, int idadeInicial){  //construtor, só vai admitir nomes com formato string e idades entre 0 e 150 anos
		if (idadeInicial <0 || idade >100){
			throw new IllegalArgumentException("Idade inválida."); 
		}
		if (nomeInicial == null || nomeInicial.isBlank()) {
			throw new IllegalArgumentException("O nome deve possuir caracteres do tipo texto.");
		}
		this.idade = idadeInicial;
		this.nome = nomeInicial;
	}
	
	public String getNome() {	//getter para exibir o nome
		return nome;
	}
	
	public int getIdade() {		//getter para exibir idade
		return  idade;
	}
}
