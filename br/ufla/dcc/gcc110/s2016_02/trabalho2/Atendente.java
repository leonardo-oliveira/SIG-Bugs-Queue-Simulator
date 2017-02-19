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
 * Interface que define os métodos comuns a todos os atendentes.
 *
 * Um atendente é alguém que atende uma fila de Entidades Atendidas. Exemplo:
 * Um caixa de banco é um atedente de clientes (entidade atendida).
 * 
 * Tem basicamente um método para identificação do atendente e outro para
 * obtenção das estatísticas da simulação. Obs: os métodos de estatísticas devem
 * funcionar tanto durante quanto ao final da simulação.
 * 
 * @author julio
 */
public interface Atendente {
    /**
     * Retorna a identificação do atendente (cada atendente deve ter uma 
     * idenficação diferente (pode ser um nome um identificador, por exemplo).
     *
     * @return A identificação do atendente.
     */
    String getIdentificacao();
    
    /**
     * Retorna a quantidade de atendimentos realizados pelo atendente na simulação.
     * 
     * @return A quantidade de atendimentos.
     */
    int getNroAtendimentos();
    
    /**
     * Retorna a duração média dos atendimentos realizados pelo atendente.
     * 
     * @return A duração média dos atendimentos.
     */
    int getDuracaoMediaAtendimentos();
    
    /**
     * Retorna o tempo de espera médio na fila do atendente.
     * 
     * @return O tempo de espera médio na fila.
     */
    int getTempoEsperaMedio();
    
    /**
     * Retorna o maior tamanho que a fila do atendente atingiu.
     * 
     * @return O maior tamanho atingido pela fila do atendente.
     */
    int getTamanhoMaximoFila();
}
