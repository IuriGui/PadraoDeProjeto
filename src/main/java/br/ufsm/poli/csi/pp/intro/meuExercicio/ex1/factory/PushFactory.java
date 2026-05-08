package br.ufsm.poli.csi.pp.intro.meuExercicio.ex1.factory;

import br.ufsm.poli.csi.pp.intro.meuExercicio.ex1.Notificacao;
import br.ufsm.poli.csi.pp.intro.meuExercicio.ex1.NotificacaoFactory;
import br.ufsm.poli.csi.pp.intro.meuExercicio.ex1.Push;

public class PushFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao() {
        return new Push();
    }
}
