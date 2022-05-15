package view;

import model.*;

public class Main {

	public static void main(String[] args) {
		
		Funcionario joelma = new Funcionario("Joelma");
		Funcionario ximbinha = new Funcionario("Ximbinha");
		Empresa google = new Empresa("Google","06.990.590/0001-23");
		
		joelma.setCpf("123.698.754-69");
		joelma.setSalario(80000.0);
		ximbinha.setCpf("897.645.852-78");
		ximbinha.setSalario(40000.00);
		google.setFuncionario(ximbinha);
		google.setFuncionario(joelma);
		
		System.out.println(joelma.getNome() + (" / ") + joelma.getCpf() + (" / ") + joelma.getSalario());
		System.out.println(ximbinha.getNome() + (" / ") + ximbinha.getCpf() + (" / ") + ximbinha.getSalario());
		System.out.println(google.getNome() + (" / ") + google.getCnpj());
		
		System.out.println("");
		
		for(Funcionario funcionario : google.getFuncionario()) {
			System.out.println(funcionario.getNome());
		}
	}
}
