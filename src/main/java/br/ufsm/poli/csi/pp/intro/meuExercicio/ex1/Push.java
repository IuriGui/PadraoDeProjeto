package br.ufsm.poli.csi.pp.intro.meuExercicio.ex1;

public class Push implements Notificacao{
    @Override
    public String enviarMensagem(String mensagem) {
        return "[PUSH] " + mensagem;
    }
}
