package br.ufsm.poli.csi.pp.intro.meuExercicio.projeto.pedido;
import br.ufsm.poli.csi.pp.intro.meuExercicio.ex5.Inimigo;

import java.util.ArrayList;
import java.util.List;

public class PedidoBuilder implements Cloneable{

    private Cliente cliente;
    private List<String> itens;
    private String observacao;
    private float desconto;
    private Endereco enderecoEntrega;

    public PedidoBuilder(Cliente c, List<String> itens){
        this.cliente = c;
        this.itens = List.copyOf(itens);
    }

    public PedidoBuilder  cliente(Cliente c){
        this.cliente = c;
        return this;
    }

    public PedidoBuilder  itens(List<String> itens){
        this.itens = List.copyOf(itens);
        return this;
    }

    public PedidoBuilder  observacao(String o){
        this.observacao = o;
        return this;
    }

    public PedidoBuilder  enderecoEntrega(Endereco e){
        this.enderecoEntrega = e;
        return this;
    }

//    public Pedido build(){
//        Pedido pedido = new Pedido(cliente,itens);
//        pedido.setDesconto(desconto);
//        pedido.setObservacao(observacao);
//        pedido.setEnderecoEntrega(enderecoEntrega);
//        return pedido;
//    }

    public PedidoBuilder desconto(float d){
        this.desconto = d;
        return this;
    }





}
