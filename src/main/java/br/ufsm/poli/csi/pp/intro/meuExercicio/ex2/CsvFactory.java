package br.ufsm.poli.csi.pp.intro.meuExercicio.ex2;

public class CsvFactory extends RelatorioFactory{
    @Override
    public Relatorio criarRelatorio() {
        return new CsvRelatorio();
    }
}
