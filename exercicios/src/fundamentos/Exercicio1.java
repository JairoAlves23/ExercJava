package fundamentos;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do Grau em Celsius");
		
		double valor = scanner.nextDouble();
		
		double novoGrau = valor * 1.8 + 32;
		
		System.out.println("Valor em Farenheit: " + novoGrau);
		
		scanner.close();
	}
	
}
