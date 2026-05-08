package br.ufsm.poli.csi.pp.intro.meuExercicio.ex4;

public class Test {

    public static void main(String[] args) {
        UIFactory f = new TemaClaro();

        System.out.println("Claro");
        f.criarBotao().renderizar();
        f.criarCard().renderizar();
        f.criarTexto().renderizar();

        System.out.println("Escuro");
        f = new TemaEscuro();
        f.criarBotao().renderizar();
        f.criarCard().renderizar();
        f.criarTexto().renderizar();
    }

}
