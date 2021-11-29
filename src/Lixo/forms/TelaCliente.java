package Lixo.forms;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaCliente extends Application {

    public static void exibir() {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TelaCliente.class.getResource("TelaCliente.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        stage.setResizable(false);
        stage.setTitle("Cliente");
        stage.setScene(scene);
        stage.show();
    }
}