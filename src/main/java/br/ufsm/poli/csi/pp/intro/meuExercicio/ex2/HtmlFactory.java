package br.ufsm.poli.csi.pp.intro.meuExercicio.ex2;

public class HtmlFactory extends RelatorioFactory{
    @Override
    public Relatorio criarRelatorio() {
        return new HtmlRelatorio();
    }
}
