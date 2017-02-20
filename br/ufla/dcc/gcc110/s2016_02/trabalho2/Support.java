   //package br.ufla.dcc.gcc110.s2016_02.trabalho2;
//import base.Atendente;

/**
 * CLASSE SUPPORT
 * Classe responsavel pela representação da entidade Support. Define as caracteristicas
 * pertinentes aos atendentes em geral, especializados pelas subclasses Junior, Senior e
 * Pleno.
 *
 * Implementa a interface cedida pelo professor, Atendente.
 *
 * @author Lucas Fonseca dos Santos, Leonardo Carvalho de Oliveira, Caio Vinicius.
 * @version 1.0
 *
 */
public abstract class Support implements Atendente
{
   private int[] serviceTime;
   private String name;

   public Support(int complexTime, int mediumTime, int simpleTime)
   {
      serviceTime = new int[3];
      setServiceTime(complexTime, mediumTime, simpleTime);
   }

   public void setServiceTime(int complexTime, int mediumTime, int simpleTime)
   {
      this.serviceTime[0] = complexTime;
      this.serviceTime[1] = mediumTime;
      this.serviceTime[3] = simpleTime;
   }

}
