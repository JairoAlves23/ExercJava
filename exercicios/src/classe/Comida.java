package classe;

public class Comida {
	
	String nome;
	Double peso;
	
	public Comida(String nome, Double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Comida [nome=" + nome + ", peso=" + peso + "]";
	}
	
	
	
	
	
	
}
