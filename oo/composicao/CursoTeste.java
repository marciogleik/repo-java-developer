package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Gleik");
		Aluno aluno3 = new Aluno("Samuel");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Desenvolvimento Rapido Python");
		Curso curso3 = new Curso("React");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);;
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Estou matriculado no curso " 
					+ curso3.nome);
			System.out.println("me chamo: " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
	}
}
