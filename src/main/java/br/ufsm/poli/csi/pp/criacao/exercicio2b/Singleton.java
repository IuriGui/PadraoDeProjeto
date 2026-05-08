package br.ufsm.poli.csi.pp.criacao.exercicio2b;

public class Singleton {

    private Singleton() {}

    private static Singleton instance;

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }

}
