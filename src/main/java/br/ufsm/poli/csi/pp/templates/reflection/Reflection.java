package br.ufsm.poli.csi.pp.templates.reflection;


import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Getter
@Setter
class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    private void mostrarMensagem() {
        System.out.println("Método privado executado");
    }

}

public class Reflection {

    public static void main(String[] args) throws Exception {

        Pessoa p = new Pessoa("Iuri", 22);

        // Obtendo a classe em tempo de execução
        Class<?> clazz = p.getClass();

        System.out.println("Nome da classe: " + clazz.getName());

        // Listando atributos
        System.out.println("\nAtributos:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field.getName());
        }

        // Acessando atributo privado
        Field nomeField = clazz.getDeclaredField("nome");
        nomeField.setAccessible(true);

        String nome = (String) nomeField.get(p);
        System.out.println("\nNome antes: " + nome);

        // Alterando atributo privado
        nomeField.set(p, "Carlos");

        System.out.println("Nome depois: " + p.getNome());

        // Listando métodos
        System.out.println("\nMétodos:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getName());
        }

        // Executando método privado
        Method metodo = clazz.getDeclaredMethod("mostrarMensagem");
        metodo.setAccessible(true);

        System.out.println("\nExecutando método privado:");
        metodo.invoke(p);
    }

}
