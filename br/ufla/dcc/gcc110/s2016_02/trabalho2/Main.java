//package br.ufla.dcc.gcc110.s2016_02.trabalho2;
import java.util.PriorityQueue;
/**
 * SIMULADOR DISCRETO DE EVENTOS PARA FILA DE REGISTRO DE BUGS
 * NO SISTEMA SIG.
 *
 * @author Lucas Fonseca dos Santos, Leonardo Carvalho de Oliveira, Caio Vinicius.
 * @version 1.0
 *
 */
public class Main
{
   public static void main(String[] args)
   {
      //Simulator s = new Simulator();
      //s.execute();

      Data dt = new Data();
      System.out.println("Quantidade de Suportes: "+dt.returnSupports());
      System.out.println("Metodo da fila: "+dt.returnMethodQueue());
      
   }
}
