package br.ufsm.poli.csi.pp.intro.meuExercicio.ex5;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Getter @Setter
@ToString
public class Inimigo implements Cloneable{

    private String nome;
    private int hp, dano;

    List<String> habilidades = new ArrayList<>();

    public Inimigo(String nome, int hp, int dano) {
        this.setHp(hp);
        this.setNome(nome);
        this.setDano(dano);
    }

    @Override
    public Inimigo clone() throws CloneNotSupportedException {
        Inimigo clone = (Inimigo) super.clone();
        clone.habilidades = new ArrayList<>(this.habilidades); // cópia profunda da lista
        return clone;
    }


    public void adicionarHabilidade(String habilidade) {
        this.habilidades.add(habilidade);
    }
}
