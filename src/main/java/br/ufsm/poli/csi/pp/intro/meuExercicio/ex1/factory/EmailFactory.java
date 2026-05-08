package br.ufsm.poli.csi.pp.intro.meuExercicio.ex1.factory;

import br.ufsm.poli.csi.pp.intro.meuExercicio.ex1.Email;
import br.ufsm.poli.csi.pp.intro.meuExercicio.ex1.Notificacao;
import br.ufsm.poli.csi.pp.intro.meuExercicio.ex1.NotificacaoFactory;

public class EmailFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao() {
        return new Email();
    }
}
