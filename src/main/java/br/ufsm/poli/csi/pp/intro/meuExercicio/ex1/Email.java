package br.ufsm.poli.csi.pp.intro.meuExercicio.ex1;

public class Email implements Notificacao{
    @Override
    public String enviarMensagem(String mensagem) {
        return "[EMAIL] " + mensagem;
    }
}
