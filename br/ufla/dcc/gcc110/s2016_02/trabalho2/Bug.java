/**
 * CLASSE BUG
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
public class Bug implements EntidadeAtendida
{
   private String identificacao;
   private int time;

   public Bug(int time, String tipo)
   {
      setTime(time);
      setIdentificacao(tipo);
   }

   public Bug(String type)
   {
      setIdentificacao(type);
   }

   public void setIdentificacao(String c)
   {
      this.identificacao = c;
   }

   public void setTime(int time)
   {
      this.time = time;
   }

   @Override
   public String getIdentificacao()
   {
      return this.identificacao;
   }

}
