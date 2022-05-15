package model;

import java.util.List;
import java.util.ArrayList;

public class Empresa {
	
	private String nome;
	private String cnpj;
	private List<Funcionario> funcionario;
	
	public Empresa() {
		
	}
	
	public Empresa(String pnome, String pcnpj) {
		this.nome = pnome;
		this.cnpj = pcnpj;
		this.funcionario = new ArrayList<Funcionario>();
	}
	//gets
	public String getNome() {
		return this.nome;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	//sets
	public void setNome(String pnome) {
		this.nome = pnome;
	}

	public void setFuncionario(Funcionario pfuncionario) {
		this.funcionario.add(pfuncionario);
	}

	public void setCnpj(String pcnpj) {
		this.cnpj = pcnpj;
	}
}
