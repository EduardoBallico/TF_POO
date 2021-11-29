package Lixo.entretenimento;

import Lixo.cliente.Cliente;

import java.util.ArrayList;

public class ListaEntretenimentos {

    private ArrayList<Entretenimento> entretenimentos;

    public void cadastra(Entretenimento e){
        entretenimentos.add(e);
    }
}
