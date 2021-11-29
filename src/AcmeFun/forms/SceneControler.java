package AcmeFun.forms;

import AcmeFun.Gerenciador;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneControler extends Application {

    private TelaCliente telaCliente;
    private TelaAdmin telaAdmin;
    private TelaLogin telaLogin;

    private Parent parLogin;
    private Parent parAdmin;
    private Parent parCliente;

    private Gerenciador gerenciador;
    private Scene activeScene;

    public void iniciar(Gerenciador g){
        gerenciador = g;
        launch();
    }

    public void switchScene(String scene){
        switch (scene){
            case "login" -> {
                activeScene.setRoot(parLogin);
            }
            case "admin" -> {
                activeScene.setRoot(parAdmin);
            }
            case "user" -> {
                activeScene.setRoot(parCliente);
            }
        }
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoaderLogin = new FXMLLoader();
        parLogin = (Parent) fxmlLoaderLogin.load(getClass().getResource("TelaLogin.fxml").openStream());
        telaLogin = (TelaLogin) fxmlLoaderLogin.getController();
        telaLogin.setGerenciador(gerenciador);
        telaLogin.setSceneManager(this);

        FXMLLoader fxmlLoaderAdm = new FXMLLoader();
        parAdmin = (Parent) fxmlLoaderAdm.load(getClass().getResource("TelaAdmin.fxml").openStream());
        telaAdmin = (TelaAdmin) fxmlLoaderAdm.getController();
        telaAdmin.setGerenciador(gerenciador);
        telaAdmin.setSceneManager(this);

        FXMLLoader fxmlLoaderCli = new FXMLLoader();
        parCliente = (Parent) fxmlLoaderCli.load(getClass().getResource("TelaCliente.fxml").openStream());
        telaCliente = (TelaCliente) fxmlLoaderCli.getController();
        telaCliente.setGerenciador(gerenciador);
        telaCliente.setSceneManager(this);

        activeScene = new Scene(parLogin, 800, 460);

        stage.setResizable(false);
        stage.setTitle("Programinha");
        stage.setScene(activeScene);
        stage.show();
    }

}
