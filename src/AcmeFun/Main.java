package AcmeFun;

import AcmeFun.forms.SceneControler;

public class Main {

	public SceneControler sceneManager;
	public Gerenciador gerenciador;

	public static void main(String[] args) {
		Gerenciador gerenciador = new Gerenciador();
		SceneControler sceneManager = new SceneControler();

		sceneManager.iniciar(gerenciador);
	}

}