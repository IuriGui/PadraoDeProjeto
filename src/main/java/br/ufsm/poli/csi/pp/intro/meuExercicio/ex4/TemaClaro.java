package br.ufsm.poli.csi.pp.intro.meuExercicio.ex4;

public class TemaClaro extends UIFactory{
    @Override
    public Botao criarBotao() {
        return new BotaoClaro();
    }

    @Override
    public Texto criarTexto() {
        return new TextoClaro();
    }

    @Override
    public Card criarCard() {
        return new CardClaro();
    }
}
