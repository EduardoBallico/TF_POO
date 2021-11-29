package Lixo;

import Lixo.forms.*;

public class Main {

	public Gerenciador gerenciador;

	public static void main(String[] args) {
		Main main = new Main();
		main.iniciar();
		main.executar();
	}

	public void iniciar(){
		gerenciador = new Gerenciador();
		// carrega dados de arquivo
	}

	public void executar(){
		gerenciador.iniciar();
	}
}