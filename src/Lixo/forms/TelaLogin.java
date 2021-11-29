package Lixo.forms;

import Lixo.Gerenciador;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaLogin extends Application {

    Gerenciador gerenciador;
    public void setGerenciador(Gerenciador g){
        gerenciador = g;
    }

    public TextField inputUsername;
    public TextField inputPassword;
    public Button btnLog;

    @FXML
    public void logIn(ActionEvent actionEvent) {
        gerenciador.logIn(inputUsername.getText(), inputPassword.getText());
    }

    public void exibir(Gerenciador g) {
        setGerenciador(g);
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TelaCliente.class.getResource("TelaLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 460);

        stage.setTitle("Cliente");
        stage.setScene(scene);
        stage.show();
    }
}
