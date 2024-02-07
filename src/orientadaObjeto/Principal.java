package orientadaObjeto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		Professor professor = new Professor();
		Cursos cursos1 = new Cursos();
		String cadastro;
		
		System.out.println("Informe o que deseja cadastrar" +
						   "\n1-Professor" +
						   "\n2-Aluno "+
						   "\n3-Curso: ");
		cadastro = sc.next();
		
		if( cadastro .equals ("Aluno") || cadastro.equals("2")) {

			System.out.println ( "Informe o nome do aluno: " );
			aluno1.nome = teclado.next();
        
        do{
        	System.out.println ( "Informe o e-mail: " );
        	
        	}while(aluno1.verificaEmail(teclado.next())!= true);
        
        do{
        	System.out.println ( "Informe a senha: " );
        	
        		}while ( aluno1.verificaSenhaAluno(teclado.next()) !=true );
		}
		
		else if(cadastro .equals("Professor") || cadastro .equals("1")) {
			
			System.out.println ( "Informe o nome do Professor: " );
	        professor.nome = teclado.next();
	        
	        do{
	        	System.out.println ( "Informe o e-mail: " );
	        
	        	} while(aluno1.verificaEmail(teclado.next())!= true);
	        
	        do{
	       
	        	System.out.println ( "Informe a senha: " );
	        	
	        	}while ( professor.verificaSenhaProfessor(teclado.next()) !=true );
			}
		
		else if(cadastro .equals("curso") || cadastro .equals("3")) {
			
			System.out.println ("INFOMAÇÕES DO CURSO: ");
			System.out.print ("---------------------- ");
			System.out.println ( "\nInforme a quantidade de Alunos no Curso: " );
			cursos1.quantidadeAlunos = teclado.next();
			System.out.println ( "Informe o tempo do curso(HORAS): " );
	        cursos1.tempo = teclado.next();
	        System.out.println ( "Informe o nome do curso: " );
	        cursos1.nomeCurso = teclado.next();

	        System.out.println(cursos1.mostrarDadosCurso());
	        teclado.close();
	        sc.close();
		}
        else {
			System.out.println ("CADASTRO INVÁLIDO");
		}
	}

}

