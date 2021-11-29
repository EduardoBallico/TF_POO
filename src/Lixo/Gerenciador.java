package Lixo;

import Lixo.acesso.ListaAcessos;
import Lixo.cliente.*;
import Lixo.entretenimento.ListaEntretenimentos;
import Lixo.forms.TelaAdmin;
import Lixo.forms.TelaLogin;

public class Gerenciador {
    private ListaAcessos lAcessos;
    private ListaEntretenimentos lEntretenimentos;
    private ListaClientes lClientes;

    private Cliente usuarioAtivo;

    public void iniciar(){
        TelaLogin tLog = new TelaLogin();
        tLog.exibir(this);
    }

    public void logIn(String user, String pass){
        if (user.equals("administracao@mail.com") && pass.equals("admin123")){
            TelaAdmin tAdm = new TelaAdmin();
            tAdm.exibir(this);
        }
    }

    public void setUsuarioAtivo(String user, String pass) {

    }

    public void cadastraCliente(String nome, String email,String senha,int cpf){
        Cliente c;
        if (true){
            c = new Individual(nome, email, senha, cpf);
        }
        else{
            c = new Empresarial();
        }

        lClientes.cadastra(c);
    }
}
