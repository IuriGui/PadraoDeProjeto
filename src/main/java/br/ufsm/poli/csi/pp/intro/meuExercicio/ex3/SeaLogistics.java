package br.ufsm.poli.csi.pp.intro.meuExercicio.ex3;

public class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
