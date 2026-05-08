package br.ufsm.poli.csi.pp.intro.meuExercicio.ex6;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorLog {

    private static GerenciadorLog instancia;

    List<String> logs = new ArrayList<>();

    private GerenciadorLog(){}

    public static GerenciadorLog getInstancia(){
        if(instancia == null){
            instancia = new GerenciadorLog();
        }
        return instancia;
    }


    public void registrar(String mensagem){
        logs.add(mensagem);
    }

    public void exibirLogs(){
        for(String s : logs){
            System.out.println(s);
        }
    }
}
