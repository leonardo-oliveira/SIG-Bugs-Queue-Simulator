import java.io.Serializable;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;

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
public class Data implements SimuladorEventos
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
         Bug bug;
         text = bf.readLine();

         while(!text.isEmpty())
         {
            tokens = text.split();
            if(tokens[3].charAt(0) == 'a')
            {
               bug = new SimpleBug(Int.parseInt(tokens[0]), tokens[1].charAt(0), tokens[3].charAt(0));
            }else if(tokens[3].charAt(0) == 'b')
               {
                  bug = new MediumBug(Int.parseInt(tokens[0]), tokens[1].charAt(0), tokens[3].charAt(0));
               }else if(tokens[3].charAt(0) == 'c')
                  {
                     bug = new ComplexBug(Int.parseInt(tokens[0]), tokens[1].charAt(0), tokens[3].charAt(0));
                  }
            pq.add(bug);
         }
         return pq;

      }catch(Exception e)
         {
            return 0;
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
            System.out.println(numberMethod);
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
            System.out.println(qtdSupports);
            return Integer.parseInt(qtdSupports);
         }
      }catch(Exception e)
         {
            return 0;
         }
   }
}
