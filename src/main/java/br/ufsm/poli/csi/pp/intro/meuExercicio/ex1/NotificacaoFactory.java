package br.ufsm.poli.csi.pp.intro.meuExercicio.ex1;

public abstract class NotificacaoFactory {

    public abstract Notificacao criarNotificacao();

    public void notificar(String mensagem) {
        Notificacao n = criarNotificacao();
        System.out.println(n.enviarMensagem(mensagem));
    }

}
