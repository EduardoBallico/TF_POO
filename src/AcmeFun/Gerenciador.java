package AcmeFun;

import AcmeFun.acesso.ListaAcessos;
import AcmeFun.cliente.*;
import AcmeFun.entretenimento.ListaEntretenimentos;
import AcmeFun.forms.SceneControler;

public class Gerenciador {
    private ListaAcessos lAcessos;
    private ListaEntretenimentos lEntretenimentos;
    private ListaClientes lClientes;
    private SceneControler sceneControler;

    private Cliente usuarioAtivo;
    private boolean adm;

    public void iniciar(){
        /*TelaLogin tLog = new TelaLogin();
        tLog.exibir(this);

        if (adm){
            TelaAdmin tAdm = new TelaAdmin();
            tAdm.exibir(this);
        }
        else{
            TelaCliente tCli = new TelaCliente();
            tCli.exibir(this);
        }*/
    }

    public void logIn(String email, String pass){
        if (email.equals("administracao@mail.com") && pass.equals("admin123")){
            sceneControler.switchScene("admin");
            usuarioAtivo = null;
        }
        else{
            Cliente c = lClientes.pesquisaClientesEmail(email);
            if(c.getSenha() == pass){
                setUsuarioAtivo(c);
                sceneControler.switchScene("user");
            }
            else{
                System.out.println("Credenciais incorretas, tente novamente.");
            }
        }
    }

    public void setUsuarioAtivo(Cliente cliente) {
        usuarioAtivo = cliente;
    }

    public void cadastraCliente(String nome, String email,String senha,int cpf){
        Cliente c;
        if (true){
            //c = new Individual(nome, email, senha, cpf);
        }
        else{
            //c = new Empresarial();
        }

        //lClientes.cadastra(c);
    }
}
