package br.ufsm.poli.csi.pp.intro.meuExercicio.ex3;

public abstract class Logistics {

    public abstract Transport createTransport();

    public void planDelivery(String carga) {
        Transport t = createTransport(); // chama o factory method
        t.deliver(carga);               // usa o produto criado
    }
}
