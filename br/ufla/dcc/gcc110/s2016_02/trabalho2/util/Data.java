import java.io.Serializable;
import java.util.ArrayList;

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
public class Data implements Serializable
{
   public ArrayList<String> loadData()
   {
      String content="";
      ArrayList<String> arrayOfInputs = new ArrayList<String>();

      try
      {
         FileReader fr = new FileReader("data/entrada.txt");
         BufferedReader loadArq = new BufferedReader(fr);

         if(!fr.exists()) return null;

         String lineContent = loadArq.readLine();
         while(!lineContent == null)
         {
            arrayOfInputs.add(loadArq.readLine());
         }
         loadArq.close();
         return arrayOfInputs;

      }catch(Exception e)
         {

         }
   }
}