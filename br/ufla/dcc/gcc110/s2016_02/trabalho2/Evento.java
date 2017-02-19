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
 * Interface que define os métodos comuns a todos os Eventos simulados.
 * 
 * Classes que implementarem a interface Evento devem implementar também a
 * interface Comparable (para funcionarem no SimuladorEventos).
 * 
 * @author julio
 */
public interface Evento {
   /**
    * Retorna o momento no qual o evento irá ocorrer na simulação.
    * 
    * @return O momeno no qual o evento irá ocorrer.
    */
   int getTempoOcorrencia();
   
   /**
    * Retorna a entidade atendida relacionada ao evento.
    * Exemplo: em um banco um evento de chegada de cliente está relacionado a
    * um cliente (que seria a entidade atendida).
    * 
    * @return A entidade relacionada ao evento
    */
   EntidadeAtendida getEntidadeAtendida();
   
   /**
    * Método que faz o tratamento do evento, ou seja, simula sua execução. Caso
    * a execução do Evento crie um novo evento ele deve ser retornado.
    * 
    * @return Se um novo evento for gerado, ele é retornado, caso contrário
    * deve-se retornar null.
    */
   Evento tratar();
}
