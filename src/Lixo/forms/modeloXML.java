package Lixo.forms;

import Lixo.Main;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class modeloXML extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(modeloXML.class.getResource("teste.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setResizable(false);
        stage.setTitle("Exemplo de GUI com FXML");
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    public void confirma(ActionEvent actionEvent) {
        System.out.println("Alo!");
    }

    public static void exibir(){
        launch();
    }

}
