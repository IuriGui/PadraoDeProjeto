package br.ufsm.poli.csi.pp.intro.meuExercicio.ex1;

import br.ufsm.poli.csi.pp.intro.meuExercicio.ex1.factory.EmailFactory;
import br.ufsm.poli.csi.pp.intro.meuExercicio.ex1.factory.PushFactory;
import br.ufsm.poli.csi.pp.intro.meuExercicio.ex1.factory.SmsFactory;

public class Run {


     public static void main(String[] args) {
         NotificacaoFactory factory = new EmailFactory();
         factory.notificar("Pedido confirmado!");

         factory = new SmsFactory();
         factory.notificar("Pedido confirmado!");

         factory = new PushFactory();
         factory.notificar("Pedido confirmado!");

    }

}
