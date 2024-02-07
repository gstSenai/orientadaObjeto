package orientadaObjeto;

public class Principal {

	public static void main(String[] args) {

		System.out.println ( "Informe o nome do aluno: " );
       
		Scanner teclado = new Scanner(System.in);
        
		//Criar um objeto da classe Aluno:
		Aluno aluno1 = new Aluno();
        //Atribuindo o dado ao nome:
        aluno1.nome = teclado.nextLine();
        do{
        System.out.println ( "Informe a senha: " );
        }while ( aluno1.verificaSenha(teclado.next()) !=true );
        //Perguntar o e-mail de novo se inválido?
        do{
        System.out.println ( "Informe o e-mail: " );
        } while(aluno1.verificaEmail(teclado.next())!= true);
        
        System.out.println(aluno1.mostrarDados());

        System.out.println ( "Informe a quantidade de Alunos no Curso: " );
        //Criar um objeto da classe Aluno:
        Cursos cursos1 = new Cursos();
        //Atribuindo o dado ao nome:
        cursos1.quantidadeAlunos = teclado.nextLine();

        System.out.println ( "Informe o tempo do curso(HORAS): " );
        cursos1.tempo = teclado.nextLine();
        System.out.println ( "Informe o nome do curso: " );
        cursos1.nomeCurso = teclado.nextLine();

        System.out.println(cursos1.mostrarDados2());

    }

}
		
		
	}

}
