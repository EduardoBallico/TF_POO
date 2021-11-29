package AcmeFun;

import AcmeFun.forms.SceneManager;

public class Main {

	public SceneManager sceneManager;
	public Gerenciador gerenciador;

	public static void main(String[] args) {
		Gerenciador gerenciador = new Gerenciador();
		SceneManager sceneManager = new SceneManager();

		sceneManager.iniciar(gerenciador);
	}

}