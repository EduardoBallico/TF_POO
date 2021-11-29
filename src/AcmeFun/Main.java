package AcmeFun;

import AcmeFun.forms.SceneControler;

public class Main {

	public SceneControler sceneManager;
	public Gerenciador gerenciador;

	public static void main(String[] args) {
		Main main = new Main();

		main.gerenciador = new Gerenciador();
		SceneControler.iniciar(main.gerenciador);
	}

}