package Lixo.forms;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;

public class Admin extends Application {

    public static void exibir() {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("JavaFX - Welcome");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        //grid.setGridLinesVisible(true);

        Text sceneTitle = new Text("Bem vindo");
        sceneTitle.setId("bemVindo");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0);

        Button cadastraCliente = new Button("Cadastrar novo cliente");
        grid.add(cadastraCliente, 0, 1);

        Button cadastraEntretenimento = new Button("Cadastrar novo entretenimento");
        grid.add(cadastraEntretenimento, 1, 1);

        Button consultarAcessos = new Button("Consultar acessos mensais");
        grid.add(consultarAcessos, 0, 2);


        // Tratamento de evento do botao
        cadastraCliente.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                modelo.exibir();
            }
        });
        cadastraEntretenimento.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });
        consultarAcessos.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

            }
        });

        Scene scene = new Scene(grid);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
