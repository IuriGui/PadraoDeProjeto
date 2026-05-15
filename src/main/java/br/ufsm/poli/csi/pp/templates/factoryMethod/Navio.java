package br.ufsm.poli.csi.pp.templates.factoryMethod;

public class Navio implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregando por mar");
    }
}
