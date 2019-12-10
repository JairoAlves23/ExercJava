package classe;

public class Pessoa {
	
	String nome;
	Double peso;
	
	public Pessoa(String nome, Double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}
	
	
	double comer (Comida comida) {
	  double novoPeso = this.peso;
	  novoPeso += comida.peso;
	  return novoPeso;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", peso=" + peso + "]";
	}
	
	
	
	
}
