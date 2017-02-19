
//package br.ufla.dcc.gcc110.s2016_02.trabalho2;
//import base.SimuladorEventos;
import java.util.List;

/**
 * CLASSE SIMULATOR
 * Classe responsável por toda a execução lógica do simulador de eventos discreto.
 * Recebe os dados do arquivo de entrada, interpreta-os, configura a execução dos
 * eventos e processa-os de acordo com as configurações informadas pela entrada.
 * 
 * @author Lucas Fonseca dos Santos, Leonardo Carvalho de Oliveira, Caio Vinicius
 * @version 1.0
 */
public class Simulator implements SimuladorEventos
{
   private int qtdSupports;
   private int methodQueue;
   private Data dt;
   private PriorityQueue<Evento> filaEventos;

   public Simulator()
   {
      dt = new Data();
      filaEventos = new PriorityQueue<Evento>();
   }

   public void execute()
   {

      methodQueue = dt.returnMethodQueue();
   }

   @Override
   public List<Atendente> getAtendentes()
   {
      return dt.returnSupports();
   }

   @Override
   private void carregarEvento() {
      Evento event = dt.loadEvent();
      adicionarEvento(event);
   }

   @Override
   private final void adicionarEvento(Evento evento) 
   {
      filaEventos.add(evento);
   }
}