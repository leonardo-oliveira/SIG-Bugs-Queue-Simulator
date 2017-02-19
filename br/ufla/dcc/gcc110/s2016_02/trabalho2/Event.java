/**
 * CLASSE EVENT
 * Classe responsavel pela representação da entidade BUG, abstraida a partir
 * de um objeto na solução proposta.
 * Superclasse para as subclasses representativas de niveis de bug.
 *
 * Implementa a interface cedida pelo professor EntidadeAtendida
 *
 * @author Lucas Fonseca dos Santos, Leonardo Carvalho de Oliveira, Caio Vinicius.
 * @version 1.0
 *
 */

public class Event implements Evento
{
   EntidadeAtendida ea;
   int timeEvent;

   public Event(int time, String status, Bug bug)
   {
      setEntidadeAtendida(bug);
      setTime(time);
   }

   public void setEntidadeAtendida(EntidadeAtendida bug)
   {
      this.ea = bug;
   }

   public void setTime(int time)
   {
      this.timeEvent = time;
   }

   @Override
   public int getTempoOcorrencia()
   {
      return this.timeEvent;
   }

   public EntidadeAtendida getEntidadeAtendida()
   {
      return this.ea;
   }

   @Override
   public Evento tratar()
   {
      return null;
   }
}
