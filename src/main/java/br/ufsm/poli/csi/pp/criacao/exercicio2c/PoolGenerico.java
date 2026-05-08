package br.ufsm.poli.csi.pp.criacao.exercicio2c;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class PoolGenerico<T> implements Pool<T> {

    private Class<T> clazz;
    private List<T> objetosDisponiveis = new ArrayList<>();
    private List<T> objetosCriados = new ArrayList<>();

    public PoolGenerico(Class<T> clazz) {
        this.clazz = clazz;
        for (int i = 0; i < 3; i++) {
            T o = criaInstancia();
            objetosCriados.add(o);
            objetosDisponiveis.add(o);
        }
    }

    @SneakyThrows
    private T criaInstancia() {
        return clazz.getDeclaredConstructor().newInstance();
    }

    @SneakyThrows
    @Override
    public T acquire() {
        synchronized (this) {
            if (objetosDisponiveis.isEmpty()) {
                if (objetosCriados.size() == 20) {
                    //coloca para esperar
                    System.out.println("[" + Thread.currentThread() + "] Não existem objetos, vai esperar...");
                    while (objetosDisponiveis.isEmpty()) {
                        this.wait();
                    }
                    System.out.println("[" + Thread.currentThread() + "] Acordou. ");
                    return objetosDisponiveis.remove(0);
                } else {
                    //cria objeto novo
                    System.out.println("[" + Thread.currentThread() + "] Não existem objetos, criando novo...");
                    T o = criaInstancia();
                    objetosCriados.add(o);
                    return o;
                }
            } else {
                //tem objeto disponivel
                System.out.println("[" + Thread.currentThread() + "] Retornando objeto já disponível de " + objetosDisponiveis.size() + "...");
                return objetosDisponiveis.remove(0);
            }
        }
    }

    @Override
    public void release(T t) {
        synchronized (this) {
            if (objetosCriados.contains(t)) {
                System.out.println("[" + Thread.currentThread() + "] Devolveu objeto.");
                objetosDisponiveis.add(t);
            } else {
                throw new IllegalArgumentException("objeto devolvido não pertence ao pool.");
            }
        }
    }
}
