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
    public Gerenciador getGerenciador() {
        return gerenciador;
    }

    @FXML
    public void logIn(ActionEvent actionEvent) {
        gerenciador.logIn(inputUsername.getText(), inputPassword.getText());
    }

}
