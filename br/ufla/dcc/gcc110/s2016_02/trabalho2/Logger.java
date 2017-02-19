//package br.ufla.dcc.gcc110.s2016_02.trabalho2;

/**
 * Classe responsavel pela geração de arquivos log do sistema. Registra todas as operações
 * executadas pelo usuario, bem como falhas do sistema e resultados, munidos de horarios e    
 * dados para futuras auditorias.
 * 
 * @author Lucas Fonseca dos Santos, Leonardo Carvalho de Oliveira, Caio Vinicius.
 * @version 1.1
 * 
 */
public class Logger 
{
   try 
   {
      File logFile = new File("logs/"+date+"-LOG.txt");
      
      if(!logFile.exists())
      {
         try
         {
            new File("logs/"+date+"-LOG.txt").createNewFile();
         }catch(Exception e)
            {

            }
      }
      
      FileReader fr = new FileReader("logs/"+date+"-LOG.txt");
      FileWriter fw = new FileWriter(fr);
      

   }catch()
      {

      }
}