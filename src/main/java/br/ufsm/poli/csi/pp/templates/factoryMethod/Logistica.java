package br.ufsm.poli.csi.pp.templates.factoryMethod;

public abstract class Logistica {

    public abstract Transporte criarTransporte();


    public void planejarEntrega() {
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }

}
