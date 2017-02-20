import java.io.Serializable;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.PriorityQueue;

//package br.ufla.dcc.gcc110.s2016_02.trabalho2;

/**
 * Classe responsável pela leitura e escrito de arquivos de dado, logger e demais
 * configurações. Referencia objetos do tipo stream de dados. Implementa interface
 * serializable para manipulação dos objetos.
 *
 * @author Lucas Fonseca dos Santos, Leonardo Carvalho de Oliveira, Caio Vinicius.
 * @version 1.1
 *
 */
public class Data
{
   //public Evento loadEvent()
//   {
//      Bug bug = new Bug();
//      return bug;
//   }

   public PriorityQueue<Evento> returnEvents()
   {
      try
      {
         FileReader fr = new FileReader("Data/files/entrada.txt");
         BufferedReader bf = new BufferedReader(fr);
         PriorityQueue<Evento> pq = new PriorityQueue<Evento>();
         String[] tokens = new String[3];
         String text = bf.readLine();
         Event event;
         text = bf.readLine();

         while(!text.isEmpty())
         {
            tokens = text.split(" ");
            event = new Event(Integer.parseInt(tokens[0]), tokens[1], new Bug(tokens[2]));
            pq.add(event);
         }
         return pq;

      }catch(Exception e)
         {
            return null;
         }
   }

   public int returnMethodQueue()
   {
      try
      {
         FileReader fr = new FileReader("Data/files/entrada.txt");
         BufferedReader bf = new BufferedReader(fr);
         String numberMethod = bf.readLine();
         numberMethod = bf.readLine();

         if(numberMethod.isEmpty())
         {
            return 0;
         }else
         {
            return Integer.parseInt(numberMethod);
         }
      }catch(Exception e)
         {
            return 0;
         }
   }

   public int returnSupports()
   {
      try
      {
         FileReader fr = new FileReader("Data/files/entrada.txt");
         BufferedReader bf = new BufferedReader(fr);
         String qtdSupports = bf.readLine();
         if(qtdSupports.isEmpty())
         {
            return 0;
         }else
         {
            return Integer.parseInt(qtdSupports);
         }
      }catch(Exception e)
         {
            return 0;
         }
   }
}
