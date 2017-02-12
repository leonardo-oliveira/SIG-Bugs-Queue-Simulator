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
package br.ufla.dcc.gcc110.s2016_02.trabalho2.base;

import java.util.List;
import java.util.PriorityQueue;

/**
 * Classe abstrata que representa um Simulador de Eventos Discretos.
 * 
 * O simulador possui uma fila de eventos e processa essa fila de eventos em
 * ordem de prioridade (tempo).
 * 
 * A cada evento processado, pode ser que um novo evento seja gerado. Caso isso
 * aconteça, ele é inserida na fila de prioridades na prioridade correta.
 * 
 * Para isso funcionar, as classes que implementam a interface Evento devem
 * implementar também a interface Comparable.
 * 
 * Para usar a classe, deve-se criar uma subclasse que representa a Simulação que
 * se deseja fazer. Depois o objeto dessa classe deverá ser criado, e deve-se
 * chamar o método executarSimulacao.
 * 
 * @author julio
 */
public abstract class SimuladorEventos {

    /**
     * Fila de eventos a serem processados pelo simulador.
     */
    private PriorityQueue<Evento> filaEventos;
    
    /**
     * Tempo atual da simulação.
     */
    private int tempoAtual;
    
    /**
     * Constrói o simulador criando a fila de eventos e inicializando tempo da
     * simulação.
     */
    public SimuladorEventos() {
        filaEventos = new PriorityQueue<>();
        tempoAtual = 0;
    }
    
    /**
     * Retorna o tempo atual da simulação.
     * 
     * @return O tempo atual da simulçaão.
     */
    public final int getTempoAtual() {
        return tempoAtual;
    }
    
    /**
     * Método abstrato para que o Simulador concreto faça o carregamento dos
     * eventos. Ao sobrescrever esse método, deve-se utilizar o método protegido
     * adicionarEvento para realmente colocar os eventos na fila de eventos.
     */
    protected abstract void carregarEventos();

    /**
     * Retorna a lista de atendentes da simulação. Deve ser sobrescrito para que
     * seja retornada a lista de atendentes utilizada pela simulação específica.
     * 
     * @return A lista de atendentes da simulação.
     */
    public abstract List<Atendente> getAtendentes();
    
    /**
     * Método protegido que adiciona um evento na fila de eventos. Deve ser
     * chamado na sobrescrita do método carregarEventos.
     * 
     * @param evento Evento a ser adicionado na fila.
     */
    protected final void adicionarEvento(Evento evento) {
        filaEventos.add(evento);
    }
    
    /**
     * Método que executa a simulação. Ele primeiro carrega os eventos; depois
     * executa os evento da fila de eventos (inserindo novos eventos caso eles
     * surjam); e, por fim, publica as estatísticas da simulação.
     */
    public final void executarSimulacao() {
        // carrega os eventos a serem simulados
        carregarEventos();
                
        // enquanto existem eventos a serem processados
        while (filaEventos.peek() != null) {
            
            // obtém o primeiro evento da fila (e o retira da fila)
            Evento evento = filaEventos.poll();
            
            // atualiza o tempo da simulação para o tempo da ocorrência do evento.
            tempoAtual = evento.getTempoOcorrencia();
            
            // chama o método de tratamento do evento e guarda um possível novo
            // evento gerado ao tratar o evento atual.
            Evento novoEvento = evento.tratar();
            
            // se foi gerado um novo evento, ele é adicionado à fila de eventos.
            if (novoEvento != null) {
                filaEventos.add(novoEvento);
            }
        }
        
        // publica as estatísticas da simulação
        publicarEstatisticas();
    }
    
    /**
     * Publica as estatísticas da simulação
     */
    protected abstract void publicarEstatisticas();
}
