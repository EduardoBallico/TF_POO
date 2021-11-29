package Lixo;

import Lixo.clientes.Cliente;
import Lixo.entretenimento.Entretenimento;

import java.util.LinkedList;

public class Gerenciador {

	private LinkedList<Acesso> acessos;
	private LinkedList<Cliente> clientes;
	private LinkedList<Entretenimento> entretenimentos;

	private BancoDeDados bancoDeDados;
	private Autenticador autenticador;

}
