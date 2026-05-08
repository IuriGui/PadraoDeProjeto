package br.ufsm.poli.csi.pp.intro.meuExercicio.ex4;

public class TemaEscuro extends UIFactory{
    @Override
    public Botao criarBotao() {
        return new BotaoEscuro();
    }

    @Override
    public Texto criarTexto() {
        return new TextoEscuro();
    }

    @Override
    public Card criarCard() {
        return new CardEscuro();
    }
}
