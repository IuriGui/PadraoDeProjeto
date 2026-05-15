package br.ufsm.poli.csi.pp.templates.factoryMethod;

public class LogisticaMaritima extends Logistica{
    @Override
    public Transporte criarTransporte() {
        return new Navio();
    }
}
