package cursojava.jdev;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private Integer idade;
	private String sexo;
	private Date dtNascimento;
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, String sobrenome, Integer idade, String sexo, Date dtNascimento) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.sexo = sexo;
		this.dtNascimento = dtNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	
	
	
}
