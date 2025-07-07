package entities;

public class PessoaFisica {
	//Esses são todas as caracteristicas de uma Pessoa Fisica 

	public String nome;
	public String email; 
	public String telefone; 
	public String senha;
	/*private String matricula;*/

	public PessoaFisica(String nome, String email, String telefone, String senha /*,String matricula*/) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		/*this.matricula = matricula;*/
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumero() {
		return telefone;
	}

	public void setNumero(String telefone) {
		this.telefone = telefone;
	}
	
	 
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}



	public String armazString(){
		String resposta = super.toString() + '\n';
		resposta += "NOME: " + nome + '\n';
		resposta += "EMAIL: " + email + '\n';
		resposta += "TELEFONE: " + telefone   + '\n';
		resposta += "SENHA: " + senha  + '\n';
		/*resposta += "MATRICULA; " + matricula + '\n';*/
		return resposta;
	}
	
}
