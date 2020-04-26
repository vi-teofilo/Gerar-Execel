package model;

public class Aluno {

	private String nome;
	private String ra;
	private Double nota1;
	private Double nota2;
	private Double nota3;
	private boolean aprovado;
	
	public Aluno() {
		
	}

	public Aluno(String nome, String ra, Double nota1, Double nota2, Double nota3, boolean aprovado) {
		
		this.nome = nome;
		this.ra = ra;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.aprovado = aprovado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getNota3() {
		return nota3;
	}

	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}


	
	
	
	
	
	
}
