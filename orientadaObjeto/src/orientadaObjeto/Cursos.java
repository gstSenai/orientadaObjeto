package orientadaObjeto;

public class Cursos {

	//Atributos:
    String quantidadeAlunos;
    String tempo;
    String nomeCurso;
    //Métodos:


    public String mostrarDados2(){
        String dados2 = "\nQuantidade de Alunos no Curso: " + quantidadeAlunos +
                        " Alunos" +
                        "\nQuantidade de tempo do é de  " + tempo +
                        " horas" +
                        "\nO nome do curso é: " + nomeCurso;

        return dados2;
    }
}

