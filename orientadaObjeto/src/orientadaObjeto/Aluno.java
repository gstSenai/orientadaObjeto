package orientadaObjeto;

public class Aluno {

	//Atributos:

    String nome;
    String senha;
    String email; 
    String serie;
    //Métodos (funções):

    public boolean verificaEmail (String email) {

        if(email.contains("@")){
            this.email = email;
            return true;
        }
    
        else{
            System.out.println("E-mail Inválido");
            return false;
        }
    }
    public String mostrarDados(){
        
        String dados = "Nome: " + nome;
                        
    return dados;

    }
    public boolean verificaSenha(String senha)  {

        if(senha.length() >= 6){
           char[] senha1 = new char [senha.length()];
            for ( int cont = 0; cont < senha.length(); cont++ ) {
            senha1[cont] = senha.charAt(cont); 
            }
            boolean teste1 = false, teste2 = false, teste3 = false;
            for ( int cont = 0; cont < senha.length();cont++ ) {
                
            if ( Character.isLowerCase(senha1[cont])) {    
                teste1 = true;
            }
                
            if ( Character.isUpperCase(senha1[cont])) {
                teste2 = true;
            }
            
            if ( Character.isDigit(senha1[cont])) {
                teste3 = true;
            }
            
            if (teste1 == true && teste2 == true && teste3 == true ) {
                break;
            }
            }
        
            if (teste1 == true && teste2 == true && teste3 == true ) {
                this.senha = senha;
                return true;
            }   
        }
        else{
            System.out.println ( "A SENHA ESTÁ FORA DOS REQUISITOS" );
            return false;
        }
        return false;
    }
}

