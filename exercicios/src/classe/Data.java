package classe;

import java.util.Date;

public class Data {

	int dia;
	int mes;
	int ano;
	
	public Data(int i, int j, int k) {
		super();
		this.dia = i;
		this.mes = j;
		this.ano = k;
	}

	@Override
	public String toString() {
		return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}

	
	
	
}
