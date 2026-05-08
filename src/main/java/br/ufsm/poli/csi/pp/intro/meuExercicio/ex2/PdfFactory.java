package br.ufsm.poli.csi.pp.intro.meuExercicio.ex2;

public class PdfFactory extends RelatorioFactory{
    @Override
    public Relatorio criarRelatorio() {
        return new PdfRelatorio();
    }
}
