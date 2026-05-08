package br.ufsm.poli.csi.pp.intro.meuExercicio.ex3;

public class Truck implements Transport{

    @Override
    public void deliver(String description) {
        System.out.println("Entregando de caminhao por terra");
    }
}
