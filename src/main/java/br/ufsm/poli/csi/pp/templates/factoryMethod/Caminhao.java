package br.ufsm.poli.csi.pp.templates.factoryMethod;

public class Caminhao implements Transporte{
    @Override
    public void entregar() {
        System.out.println("Entregando por terra");
    }
}
