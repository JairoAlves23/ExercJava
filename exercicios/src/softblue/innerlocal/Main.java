package softblue.innerlocal;

public class Main {

	public static void main(String[] args) {
				
		String t2 = "Imprimir dado fora";
		
		class Texto {
			private String t;
			
			public Texto(String t) {
				this.t = t;
			}
			
			public void imprimir() {
				System.out.println(t);
			}
			
			public void imprimir2() {
				System.out.println(t2);
			}
		
		}

		Texto txt = new Texto("Meu texto");
		txt.imprimir();
		txt.imprimir2();
		
	}

}
