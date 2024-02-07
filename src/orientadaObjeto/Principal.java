package orientadaObjeto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		Professor professor = new Professor();
		Cursos cursos1 = new Cursos();
		int cadastro;
		int quantAlunos = 0, contP = 0, contF = 0;
		
		do {
		
		System.out.println("Informe o que deseja cadastrar" +
						   "\n1-Professor" +
						   "\n2-Aluno "+
						   "\n3-Curso " +
						   "\n4-Chamada "+
						   "\n0-Sair");
		cadastro = sc.nextInt();
		
		if( cadastro == 2) {
			
			System.out.println("Digite a quantidade alunos que deseja cadastrar: ");
			quantAlunos = sc.nextInt();
			
			for(int cont = 0; cont < quantAlunos; cont ++) {

			System.out.println ( "Informe o nome do aluno: " );
			aluno1.nome[cont] = sc.next();
			        
        do{
        	System.out.println ( "Informe o e-mail: " );
        	
        	}while(aluno1.verificaEmail(teclado.next())!= true);
        
        do{
        	System.out.println ( "Informe a senha: " );
        	
        		}while ( aluno1.verificaSenhaAluno(teclado.next()) !=true );
			}
		}
		
		else if( cadastro == 1 ) {
			
			System.out.println ( "Informe o nome do Professor: " );
	        professor.nome = teclado.next();
	        
	        do{
	        	System.out.println ( "Informe o e-mail: " );
	        
	        	} while(aluno1.verificaEmail(teclado.next())!= true);
	        
	        do{
	       
	        	System.out.println ( "Informe a senha: " );
	        	
	        	}while ( professor.verificaSenhaProfessor(teclado.next()) !=true );
			}
		
		else if( cadastro == 3 ) {
			
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
		else if(cadastro == 4) {
			
			for ( int cont = 0; cont < quantAlunos; cont ++ ) {
				for(int cont2 = 0; cont2 < 1; cont2 ++) {
					
					System.out.println("CHAMADA Aluno: " + aluno1.nome[cont] +
									   "\n1-Presente" +
									   "\n2-Faltou: ");
					int chamada = sc.nextInt();
					
					if(chamada == 1) {
						System.out.println(aluno1.nome[cont] + " ESTÁ PRESENTE");
						contP ++;
					}
					else if(chamada == 2) {
						System.out.println(aluno1.nome[cont] + " NÃO ESTÁ PRESENTE");
						contF ++;
					}
					else {
						System.out.println("ERRO");
					}
				}
			}
			System.out.println("ESTÃO PRESENTES " + contP + " Alunos");
			System.out.println("ESTÃO FALTANDO " + contF + " Alunos");

			
		}
        else {
			
        	System.out.println ("ENCERROU O PROGRAMA");
			
        	}
		}while( cadastro != 0 );
	}
}

