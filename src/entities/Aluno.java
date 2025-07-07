package entities;

public class Aluno extends PessoaFisica {
	private String curso;
	private String matricula;
	//Porque o semestre não pode ser Uma String ????
	//ate pq e o semestre inicial então a resposta guardada dentro dele seria --2024/1--
	private String semestreInicial; 
	
	

	public Aluno(String nome, String email, String telefone, String senha, /*String matricula,*/String curso, String matricula, String semestreInicial) {
		super(nome, email, telefone, senha);
		this.curso = curso;
		this.matricula = matricula;
		this.semestreInicial = semestreInicial;
	}
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getMatricula(){
		return matricula;
	}

	public void setMatricula(String matricula){
		this.matricula = matricula;
	}

	public String getSemestreInicial() {
		return semestreInicial;
	}

	public void setSemestreInicial(String semestreInicial) {
		this.semestreInicial = semestreInicial;
	}

	protected void destruidor() throws Throwable{
		System.out.println("Destruindo Objeto: " + this);
	}
	
	public String toString(){
		String resposta = super.toString();
		resposta += '\n';
		resposta += "NOME: " + nome + '\n';
		resposta += "CURSO: " + curso + '\n';
		resposta += "SEMESTRE INICIAL: " + semestreInicial + '\n';
		resposta += "MATRICULA: " + matricula + '\n';
		resposta += "EMAIL: " + email + '\n';
		resposta += "TELEFONE: " + telefone + '\n';
		resposta += "SENHA: " + senha + '\n';
	
		return resposta;
	}
	
}
