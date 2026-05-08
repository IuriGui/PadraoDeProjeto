package br.ufsm.poli.csi.pp.intro.meuExercicio.ex2;



public class Runedas {


     public static void main(String[] args) {
         RelatorioFactory factory;
         factory = new HtmlFactory();
         Relatorio r = factory.criarRelatorio();
         String rs = r.gerar("Vendas Q1", "Total: R$ 50.000");
         System.out.println(rs);


     }

}
