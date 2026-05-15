package br.ufsm.poli.csi.pp.templates.factoryMethod;

public class LogisticaTerreste extends Logistica{
    @Override
    public Transporte criarTransporte() {
        return new Caminhao();
    }
}
