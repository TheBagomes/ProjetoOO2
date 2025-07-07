package entities;

public class Professor extends PessoaFisica{
	private String matriculaProf;
	private String curso; 
	private String cargoAcademico;
	
	public Professor(String nome, String email, String telefone, String senha, String matriculaProf, String curso, String cargoAcademico) {
		super(nome, email, telefone, senha /*matricula*/);
		this.matriculaProf = matriculaProf;
		this.curso = curso;
		this.cargoAcademico = cargoAcademico;
	}


	public String getMatriculaProf() {
		return matriculaProf;
	}

	public void setMatriculaPraf(String matriculaProf) {
		this.matriculaProf = matriculaProf;
	}	


	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCargoAcademico() {
		return cargoAcademico;
	}

	public void setCargoAcademico(String cargoAcademico) {
		this.cargoAcademico = cargoAcademico;
	}

	protected void destruidor(){
		System.out.println("Destruindo Objeto: " + this);
	}

	public String toString(){
		String resposta = super.toString();
		resposta += '\n';
		resposta += "NOME: " + nome + '\n';
		resposta += "CURSO: " + curso + '\n';
		resposta += "CARGO: " + cargoAcademico + '\n';
		resposta += "MATRICULA: " + matriculaProf + '\n';
		resposta += "EMAIL: " + email + '\n';
		resposta += "TELEFONE: " + telefone + '\n';
		resposta += "SENHA: " + senha + '\n';
	
		return resposta;
	}


	
	

}
