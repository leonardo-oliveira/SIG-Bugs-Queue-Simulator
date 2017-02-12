/**
 * Classe responsavel pela representação da entidade Suporte-Senior abstraido a partir
 * de um objeto na solução proposta. Representa um atendente de nivel alto, ou seja,
 * de maior capacitação e experiencia, em outras palavras, trabalho mais veloz com menos
 * probabilidade de erros.
 * 
 * Herda a superclasse Support.
 * 
 * @author Lucas Fonseca dos Santos, Leonardo Carvalho de Oliveira, Caio Vinicius.
 * @version 1.1
 * 
 */
public class SupportSenior extends Support
{
   public SupportSenior()
   {
      super(180,120,60);
   }
}