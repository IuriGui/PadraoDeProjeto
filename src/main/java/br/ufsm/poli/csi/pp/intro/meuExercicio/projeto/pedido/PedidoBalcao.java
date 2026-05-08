package br.ufsm.poli.csi.pp.intro.meuExercicio.projeto.pedido;

import java.util.List;

public class PedidoBalcao extends Pedido {




    @Override
    public void processar() {
        System.out.println("Cliente veio buscar no balcão");
    }
}
