package br.ufsm.poli.csi.pp.templates.factoryMethod;

public class Cliente {

    public static void main(String[] args) {
        Logistica logistica = new LogisticaMaritima();

        logistica.planejarEntrega();

    }
}
