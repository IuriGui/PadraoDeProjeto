package br.ufsm.poli.csi.pp.intro.meuExercicio.ex2;

public class CsvRelatorio implements Relatorio{

    @Override
    public String gerar(String titulo, String conteudo) {
        return "[CSV] " + '"' +titulo + '"' +"," + '"' +conteudo+ '"';
    }
}
