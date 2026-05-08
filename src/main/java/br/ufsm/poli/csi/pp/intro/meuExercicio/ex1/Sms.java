package br.ufsm.poli.csi.pp.intro.meuExercicio.ex1;

public class Sms implements Notificacao{
    @Override
    public String enviarMensagem(String mensagem) {
        return "[SMS] " + mensagem;
    }
}
