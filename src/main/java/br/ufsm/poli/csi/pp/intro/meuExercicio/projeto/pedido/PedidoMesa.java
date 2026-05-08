package br.ufsm.poli.csi.pp.intro.meuExercicio.projeto.pedido;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter @Setter @ToString
public class PedidoMesa extends Pedido{

    private int numeroMesa;

    public PedidoMesa(Cliente c, List<String> itens) {
        super(c, itens);
    }

    public PedidoMesa(Cliente c, List<String> itens, int numeroMesa) {
        super(c, itens);
        this.setNumeroMesa(numeroMesa);
    }

    @Override
    public void processar() {
        System.out.println("Pedido encaminhado para mesa " + numeroMesa);
    }
}
