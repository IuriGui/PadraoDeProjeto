package br.ufsm.poli.csi.pp.intro.meuExercicio.projeto.factory;

import br.ufsm.poli.csi.pp.intro.meuExercicio.projeto.pedido.Cliente;
import br.ufsm.poli.csi.pp.intro.meuExercicio.projeto.pedido.Pedido;

import java.util.List;

public abstract class PedidoFactory {

    public abstract Pedido criarPedido(Cliente c, List<String> itens);


}
