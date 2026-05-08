package br.ufsm.poli.csi.pp.intro.meuExercicio.ex7;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conexao {
    private int id;

    public Conexao(int i) {
        this.id = i;
    }

    public void executarQuery(String query){
        System.out.println("[CONEXAO " + getId() + "]" + "Executando: " + query);
    }

}
