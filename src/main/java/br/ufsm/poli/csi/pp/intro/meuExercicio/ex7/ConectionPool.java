package br.ufsm.poli.csi.pp.intro.meuExercicio.ex7;

import java.util.ArrayList;
import java.util.List;

public class ConectionPool {

    private static ConectionPool INSTANCIA;

    private List<Conexao>  conexoesLivres = new ArrayList<>();
    private List<Conexao>  emUso = new ArrayList<>();

    private ConectionPool(){
        for (int i = 1; i < 3; i++) {
            conexoesLivres.add(new Conexao(i));
        }
    }

    public static ConectionPool getInstancia(){
        if(INSTANCIA == null){
            INSTANCIA = new ConectionPool();
        }
        return INSTANCIA;
    }

    public Conexao adquirir(){
        if(conexoesLivres.isEmpty()){
            throw new RuntimeException("Nenhuma conexão disponível no pool!");
        }
        Conexao recurso = conexoesLivres.getLast();
        conexoesLivres.removeLast();
        emUso.add(recurso);
        return recurso;
    }


    public void liberar(Conexao conexao){
        emUso.remove(conexao);
        conexoesLivres.add(conexao);
    }

}
