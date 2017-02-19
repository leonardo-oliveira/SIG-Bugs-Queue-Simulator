/*
 * Código fornecido como parte das especificações do Trabalho 2 das turmas
 * 10A e 22A, período 2016-2.
 *
 * Disciplina: GCC110 - Programação Orientada a Objetos
 * Departamento de Ciência da Computação (DCC)
 * Universidade Federal de Lavras (UFLA)
 *
 * Prof. Júlio César Alves
 */
//package br.ufla.dcc.gcc110.s2016_02.trabalho2.base;

/**
 * Interface que representa uma entidade atendida na simulação.
 *
 * Exemplo: em um banco, a entidade atendida são os clientes. Assim, os eventos
 * de chegada da simulação se referem à chegada de clientes para serem atendidos
 * pelos caixas (atendentes).
 *
 * @author julio
 */
public interface EntidadeAtendida {
    /**
     * Retorna a identificação da entidade atendida (pode ser um nome ou um
     * identificador, por exemplo).
     *
     * @return A identificação da entidade atendida.
     */
    String getIdentificacao();
}
