package softblue.inneranonymos;

public class Main {

	public static void main(String[] args) {
		int x = 2;
		Bebida b1 = new Cha();
		Bebida b2 = new Bebida() {
			@Override
			public void preparar() {
				System.out.println("Preparando bebida n�o identificada");
				//x++; n�o pode alterar o valor dessa variavel.
			}		
		};
		b1.preparar();
		b2.preparar();
	}
		
}
