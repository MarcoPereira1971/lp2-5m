public class Caminhao {
   private Tanque tanque;
   private UnidadeDistancia unidadeDistancia;
   private Mapa mapa;
   
	public void setUnidadeDistancia(UnidadeDistancia unidadeDistancia) {
		this.unidadeDistancia = unidadeDistancia;
	}

    public Caminhao(Mapa mapa)
    {
	   this.tanque = new Tanque(0);
	   this.mapa = mapa;
    }
       
   /** @param distancia */
   public boolean avancar(int distancia) {
      
	  for (int n = 1; n<=distancia;n++)
	  {		  
		  if (mapa.getProximo() == null)
			  return false;
		  
		  if (!tanque.gastar(1))
			  return false;

		  UnidadeDistancia prox =  mapa.getProximo();
		  		  
		  unidadeDistancia.setCaminhao(null);
		  unidadeDistancia = prox;
		  unidadeDistancia.setCaminhao(this);
		  
	  }
	  return true;
   }
   
   /** @param distancia*/
   public boolean voltar(int distancia){	      
	  for (int n = 1; n<=distancia;n++)
	  {		  
		  if (mapa.getAnterior() == null)
			  return false;
		  
		  if (!tanque.gastar(1))
			  return false;

		  unidadeDistancia =  mapa.getProximo();
		  
	  }
	  return true;
   }
   
   /** @param combustivel*/
   public boolean descarregar(int combustivel) {
      if (tanque.gastar(combustivel))
      {
    	  unidadeDistancia.depositar(combustivel);
    	  return true;
      }
      return false;
   }
   
   /** @param combustivel */
   public boolean carregar(int combustivel) {
      
	   if (mapa.getPrimeira() == unidadeDistancia ||
			   unidadeDistancia.retirar(combustivel))
      {
    	  tanque.abastecer(combustivel);
    	  return true;
      }
      return false;
      
   }

@Override
public String toString() {
	/*
	return "Caminhao [tanque=" + tanque + ", unidadeDistancia="
			+ unidadeDistancia + ", mapa=" + mapa + "]";
			*/
	
	return "CC ";
}




}