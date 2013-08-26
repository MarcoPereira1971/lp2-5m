
public class Tanque {
   private int combustivel;
   private int capacidade = 6;
   
   /** @param combustivel */
   public Tanque(int combustivel)
   {
	   this.combustivel = combustivel;	   
   }
   
   /** @param combustivel */
   public boolean gastar(int combustivel) {
	   if (this.combustivel > combustivel)
	   {
		   this.combustivel -= combustivel;
		   return true;
	   }		   
	   return false;
   }
   
   /** @param unidadades */
   public boolean abastecer(int unidades) {
      if ((combustivel + unidades) <= capacidade)
      {
    	  combustivel+=unidades;
    	  return true;
      }
      return false;
   }

}