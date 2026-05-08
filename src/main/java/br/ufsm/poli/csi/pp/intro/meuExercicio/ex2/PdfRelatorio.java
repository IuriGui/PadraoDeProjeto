package br.ufsm.poli.csi.pp.intro.meuExercicio.ex2;

public class PdfRelatorio implements Relatorio{
    @Override
    public String gerar(String titulo, String conteudo) {
        return "[PDF] == " + titulo + " == \n" + conteudo;
    }
}
