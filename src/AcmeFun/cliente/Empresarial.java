package AcmeFun.cliente;

import java.util.LinkedList;

public class Empresarial extends Cliente {

	private int cnpj;

	private String nomeFantasia;

	private LinkedList<Individual> colaboradores;

	public Empresarial(String nome, String email, String senha, int cnpj, String nomeFantasia, LinkedList colaboradores) {
		super(nome, email, senha);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.colaboradores = colaboradores;
	}

	public int getCnpj() { return cnpj; }
	public LinkedList<Individual> getColaboradores() { return colaboradores; }
	public String getNomeFantasia() { return nomeFantasia; }
}
