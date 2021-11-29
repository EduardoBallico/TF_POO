package Lixo.forms;

import Lixo.Gerenciador;
import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.*;
import javafx.scene.*;

import java.io.IOException;

public class TelaCliente extends Application {

    Gerenciador gerenciador;
    public void setGerenciador(Gerenciador g){
        gerenciador = g;
    }

    public ComboBox<String> comboCat;
    public ComboBox<String> comboFiltro;
    public TextField fieldCat;
    public ListView<String> listCat;
    public ComboBox<String> comboAcesso;
    public CheckBox checkAcesso;
    public ComboBox<String> comboCobraAno;
    public ComboBox<String> comboCobraMes;
    public ListView<String> listCobra;

    public void exibir(Gerenciador g) {
        setGerenciador(g);
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TelaCliente.class.getResource("TelaCliente.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 460);

        stage.setTitle("Cliente");
        stage.setScene(scene);
        stage.show();
    }
}
