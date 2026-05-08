package br.ufsm.poli.csi.pp.intro.meuExercicio.projeto.pedido;

import java.util.List;

public class PedidoDelivery extends Pedido{

    private Endereco enderecoEntrega;

    public PedidoDelivery(Cliente c, List<String> itens) {
        super(c, itens);
    }

    @Override
    public void processar() {
        System.out.println("Pedido encaminhado para entrega em " + enderecoEntrega);
    }
}
