package br.ufsm.poli.csi.pp.intro.meuExercicio.projeto.factory;

import br.ufsm.poli.csi.pp.intro.meuExercicio.projeto.pedido.Cliente;
import br.ufsm.poli.csi.pp.intro.meuExercicio.projeto.pedido.Pedido;
import br.ufsm.poli.csi.pp.intro.meuExercicio.projeto.pedido.PedidoMesa;

import java.util.List;

public class MesaFactory extends PedidoFactory{

    private int numeroMesa;


    @Override
    public Pedido criarPedido(Cliente c, List<String> itens) {
        PedidoMesa p = new PedidoMesa(c, itens);
        p.setNumeroMesa(this.numeroMesa);
        return p;
    }
}
