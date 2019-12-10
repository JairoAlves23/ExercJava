package filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainAluno {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Jose",9.5);
		Aluno a2 = new Aluno("Maria",10);
		Aluno a3 = new Aluno("Joao",7.5);
		Aluno a4 = new Aluno("Marcos",5);
		Aluno a5 = new Aluno("Lucas",6.5);
		Aluno a6 = new Aluno("Pedro",6);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		Predicate<Aluno> aprovado = a -> a.nota > 7;
		Function<Aluno, String> lista = a -> "Aluno " + a.nome + " Aprovado";
		
		
		alunos.stream().filter(aprovado).map(lista)
		.forEach(System.out::println);
		
	}

}
