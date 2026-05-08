package br.ufsm.poli.csi.pp.intro.meuExercicio.projeto.pedido;

import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Setter
@ToString
public abstract class Pedido implements Cloneable {
    private Long numero;
    private Cliente cliente;
    private List<String> itens;
    private String observacao;
    private float desconto;


    public abstract void processar();
    @Override
    public Pedido clone() throws CloneNotSupportedException {
        Pedido clone = (Pedido) super.clone();
        clone.itens = new ArrayList<>(this.itens);
        clone.cliente = new Cliente();
        clone.cliente.setNome(this.cliente.getNome());
        clone.cliente.setCpf(this.cliente.getCpf());
        return clone;
    }
}
