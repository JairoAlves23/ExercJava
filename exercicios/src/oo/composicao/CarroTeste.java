package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.println(c1.estaLiagado());
		c1.ligar();
		System.out.println(c1.estaLiagado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		
	}

}
