package br.ufsm.poli.csi.pp.intro.meuExercicio.ex5;

public class PersonagemBuilder {
    private String nome, classe, arma, armadura, magia;

    public PersonagemBuilder(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
    }

    public PersonagemBuilder arma(String v) { this.arma = v; return this; }
    public PersonagemBuilder armadura(String v) { this.armadura = v; return this; }
    public PersonagemBuilder magia(String v) { this.magia = v; return this; }

    public Personagem build() {
        Personagem p = new Personagem();
        p.setNome(nome);
        p.setClasse(classe);
        p.setArma(arma);
        p.setArmadura(armadura);
        p.setMagia(magia);
        return p;
    }
}