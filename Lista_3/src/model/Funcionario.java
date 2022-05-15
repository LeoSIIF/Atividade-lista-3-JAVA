package model;

public class Funcionario {

	private String nome;
	private String cpf;
	private Double salario;
	
	public Funcionario() {
		
	}

	public Funcionario(String pnome) {
		this.nome = pnome;
	}
	//gets
	public String getNome(){
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public Double getSalario() {
		return this.salario;
	}
	//sets
	public void setNome(String pnome) {
		this.nome = pnome;
	}
	
	public void setCpf(String pcpf) {
		this.cpf = pcpf;
	}
	
	public void setSalario(Double psalario) {
		this.salario = psalario;
	}
}
