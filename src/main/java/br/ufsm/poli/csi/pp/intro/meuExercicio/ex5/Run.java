package br.ufsm.poli.csi.pp.intro.meuExercicio.ex5;

import br.ufsm.poli.csi.pp.intro.meuExercicio.ex6.GerenciadorLog;
import br.ufsm.poli.csi.pp.intro.meuExercicio.ex7.ConectionPool;
import br.ufsm.poli.csi.pp.intro.meuExercicio.ex7.Conexao;

public class Run {

    public static void main(String[] args) throws CloneNotSupportedException {

        ConectionPool pool = ConectionPool.getInstancia();

        Conexao c1 = pool.adquirir();
        Conexao c2 = pool.adquirir();
        Conexao c3 = pool.adquirir();

        c1.executarQuery("SELECT * FROM usuarios");
        c2.executarQuery("SELECT * FROM pedidos");

        pool.liberar(c1);
        pool.liberar(c2);

        Conexao c4 = pool.adquirir(); // reutiliza c1
        Conexao c5 = pool.adquirir(); // reutiliza c2

        c4.executarQuery("UPDATE usuarios SET ativo = true");
        c5.executarQuery("DELETE FROM pedidos WHERE id = 1");

        pool.liberar(c3);
        pool.liberar(c4);
        pool.liberar(c5);

    }


    void singleton(){
        GerenciadorLog log1 = GerenciadorLog.getInstancia();
        log1.registrar("Sistema iniciado");
        log1.registrar("Usuário logado");

        GerenciadorLog log2 = GerenciadorLog.getInstancia();
        log2.registrar("Pedido criado");

        log1.exibirLogs();

        System.out.println(log1 == log2);

    }

    void testaClone() throws CloneNotSupportedException {
        Inimigo base = new Inimigo("Goblin", 100, 15);
        base.adicionarHabilidade("Mordida");
        base.adicionarHabilidade("Fuga");

        Inimigo clone1 = base.clone();
        clone1.setNome("Goblin Guerreiro");
        clone1.adicionarHabilidade("Investida");

        Inimigo clone2 = base.clone();
        clone2.setNome("Goblin Arqueiro");
        clone2.adicionarHabilidade("Flecha");

        System.out.println(base);
        System.out.println(clone1);
        System.out.println(clone2);
    }



    void TesteBuilder(){
        Personagem guerreiro = new PersonagemBuilder("Arthur", "Guerreiro")
                .arma("Espada")
                .armadura("Cota de malha")
                .build();

        Personagem mago = new PersonagemBuilder("Merlin", "Mago")
                .arma("Cajado")
                .magia("Bola de fogo")
                .build();

        System.out.println(guerreiro);
        System.out.println(mago);
    }

}
