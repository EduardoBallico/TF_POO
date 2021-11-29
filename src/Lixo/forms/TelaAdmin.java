package Lixo.forms;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaAdmin extends Application {

    public TextField inputNomeUsu;
    public TextField inputEmailUsu;
    public TextField inputSenhaUsu;
    public CheckBox chBoxContaEmp;
    public Pane paneEmpresarial;
    public TextField inputCNPJ;
    public TextField inputNomeFant;
    public Button btnCriarContaEmp;
    public Pane paneUsuario;
    public TextField inputCPF;
    public CheckBox chBoxVinculado;
    public TextField inputEmpresa;
    public Button btnCriarContaUsu;

    public ComboBox<String> cBoxTEntretenimento;
    public TextField inputTitulo;
    public TextField inputAno;
    public Pane paneEpSerie;
    public TextField inputSerieEp;
    public TextField inputTempEp;
    public TextField inputNumEp;
    public Button btnCadastraEP;
    public Pane paneFilme;
    public TextField inputDuracaoFilme;
    public Button btnCadastraFilme;
    public Pane paneJogo;
    public TextField inputNomeOriginal;
    public TextField inputGenero;
    public Button btnCadastraJogo;
    public Pane paneSerie;
    public TextField inputConclusao;
    public Button btnCadastraSerie;

    public ComboBox<String> cBoxMes;
    public ComboBox<String> cBoxAno;
    public ListView<String> lViewConsulta;
    public Button btnConsulta;

    public TextField inputNomeArquivo;
    public ListView<String> lViewCargaDados;
    public Button btnSimula;

    public static void exibir() {
        launch();
    }

    @FXML
    public void criaCliente(ActionEvent actionEvent) {
        //Gerenciador.CadastraUsuario();
    }

    @FXML
    public void criaEntretenimento(ActionEvent actionEvent) {
        //Gerenciador.();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TelaCliente.class.getResource("TelaAdmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 460);

        stage.setTitle("Cliente");
        stage.setScene(scene);
        stage.show();
    }
}