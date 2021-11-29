package AcmeFun.forms;

import AcmeFun.Gerenciador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class TelaLogin {

    public TextField inputUsername;
    public TextField inputPassword;
    public Button btnLog;

    private Gerenciador gerenciador;
    public void setGerenciador(Gerenciador g) {
        this.gerenciador = g;
    }
    private SceneControler sceneManager;
    public void setSceneManager(SceneControler s) {
        this.sceneManager = s;
    }

    @FXML
    public void logIn(ActionEvent actionEvent) {


        System.out.println("MILAGRE");
        sceneManager.switchScene("admin");

        gerenciador.logIn(inputUsername.getText(), inputPassword.getText());
        //System.out.println("Usuario fez login");
    }

}
