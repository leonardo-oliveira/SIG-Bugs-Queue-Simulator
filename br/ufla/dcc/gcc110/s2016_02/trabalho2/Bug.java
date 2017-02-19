/**
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
public abstract class bug implements Entidade
{
   public Bug(int time, char status, char tipo)
   {
      setTime(time);
      setStatus(status);
      setTipo(tipo);
   }
}
