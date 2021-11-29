package AcmeFun;

import AcmeFun.acesso.ListaAcessos;
import AcmeFun.cliente.*;
import AcmeFun.entretenimento.ListaEntretenimentos;

public class Gerenciador {
    private ListaAcessos lAcessos;
    private ListaEntretenimentos lEntretenimentos;
    private ListaClientes lClientes;

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

    public void logIn(String user, String pass){
        if (user.equals("administracao@mail.com") && pass.equals("admin123")){
            adm = true;
        }
        else{
            adm = false;
        }
    }

    public void setUsuarioAtivo(String user, String pass) {

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
