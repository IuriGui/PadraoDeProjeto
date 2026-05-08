package br.ufsm.poli.csi.pp.intro.meuExercicio.ex3;

public class RunBaby {

    public static void main(String[] args) {
        Logistics logistics;

        logistics = new RoadLogistics();
        logistics.planDelivery("Eletrônicos");

        logistics = new SeaLogistics();
        logistics.planDelivery("Contêiner de móveis");
    }

}
