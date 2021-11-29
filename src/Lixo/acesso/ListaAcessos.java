package Lixo.acesso;

import Lixo.cliente.Cliente;

import java.util.ArrayList;

public class ListaAcessos {

    private ArrayList<Acesso> acessos;

    public void cadastra(Acesso a){
        acessos.add(a);
    }
}
