package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo calculo = (x,y) -> { return x + y; };
		Calculo calculo2 = (x,y) -> { return x * y; };
		
		System.out.println(calculo.excecutar(2, 3));
		System.out.println(calculo2.excecutar(2, 3));
	}
	
}
