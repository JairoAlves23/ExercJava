package classe;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Jairo",81.0);
		Comida c1 = new Comida("Feij�o",1.0);
		Comida c2 = new Comida("Arroz",2.0);
		
		System.out.println(p1);
		System.out.println(p1.comer(c1) + " " + c1.nome);
		System.out.println(p1.comer(c2)  + " " + c2.nome);
		

	}

}
