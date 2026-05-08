package br.ufsm.poli.csi.pp.intro.meuExercicio.ex3;

public class Ship implements Transport{
    @Override
    public void deliver(String description) {
        System.out.println("Entregando de navio por mar");
    }
}
