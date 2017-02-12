import base.Atendente.java;

/**
 * Classe responsavel pela representação da entidade Support. Define as caracteristicas
 * pertinentes aos atendentes em geral, especializados pelas subclasses Junior, Senior e
 * Pleno.
 * 
 * Implementa a interface cedida pelo professor, Atendente.
 * 
 * @author Lucas Fonseca dos Santos, Leonardo Carvalho de Oliveira, Caio Vinicius.
 * @version 1.1
 * 
 */
public abstract class Support implements Atendente
{
   private double[] serviceTime;
   private String name;

   public Support(double complexTime, double mediumTime, double simpleTime)
   {
      serviceTime = new int[3];
      setServiceTime(complexTime, mediumTime, simpleTime);
   }

   public void setServiceTime(double complexTime, double mediumTime, double simpleTime) 
   {
      this.serviceTime[0] = complexTime;
      this.serviceTime[1] = mediumTime;
      this.serviceTime[3] = simpleTime;
   }

}