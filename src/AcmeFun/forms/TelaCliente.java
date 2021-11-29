package AcmeFun.forms;

import AcmeFun.Gerenciador;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class TelaCliente{

    public ComboBox<String> comboCat;
    public ComboBox<String> comboFiltro;
    public TextField fieldCat;
    public ListView<String> listCat;
    public ComboBox<String> comboAcesso;
    public CheckBox checkAcesso;
    public ComboBox<String> comboCobraAno;
    public ComboBox<String> comboCobraMes;
    public ListView<String> listCobra;

    private Gerenciador gerenciador;
    public void setGerenciador(Gerenciador g) {
        this.gerenciador = g;
    }
    private SceneManager sceneManager;
    public void setSceneManager(SceneManager s) {
        this.sceneManager = s;
    }

}
