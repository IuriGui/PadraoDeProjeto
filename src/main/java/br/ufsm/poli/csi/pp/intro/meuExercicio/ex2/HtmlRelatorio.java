package br.ufsm.poli.csi.pp.intro.meuExercicio.ex2;

public class HtmlRelatorio implements Relatorio{
    @Override
    public String gerar(String titulo, String conteudo) {
        return "[HTML] <h1>titulo</h1> " + "<p>"+ conteudo + "</p>";
    }
}
