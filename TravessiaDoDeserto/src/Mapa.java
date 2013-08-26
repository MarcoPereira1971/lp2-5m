import java.util.*;
public class Mapa 
{
	private Collection<UnidadeDistancia> mapa;
	private final int tamanho = 10;
	private Caminhao caminhao;
	
		
	public Caminhao getCaminhao() {
		return caminhao;
	}

	public Mapa()
	{
		mapa = get();
				
		for (int n=1;n<=tamanho;n++)
			mapa.add(new UnidadeDistancia(this));
		caminhao = new Caminhao(this);
		getPrimeira().setCaminhao(caminhao);		
		 
	}	
	
	public Collection<UnidadeDistancia> get() 
	{
		 if (mapa == null)
			 mapa = new HashSet<UnidadeDistancia>();
		 return mapa;
	}	

	public UnidadeDistancia getPrimeira()
	{		 
		 for (UnidadeDistancia ud: mapa)
		 {
			 return ud;					
		 }		 
		 return null;		
	}

	public UnidadeDistancia getProximo(UnidadeDistancia unidadeDistancia)
	{		 
		 boolean proximo=false;
		 for (UnidadeDistancia ud: mapa)
		 {
			 if (proximo)
				 return ud;
			 else if (ud == unidadeDistancia)
				 proximo=true;					
		 }		 
		 return null;		
	}
	
	public UnidadeDistancia getProximo()
	{		 
		 boolean proximo=false;
		 for (UnidadeDistancia ud: mapa)
		 {
			 if (proximo)
				 return ud;
			 else if (ud.getCaminhao() != null)
				 proximo=true;					
		 }		 
		 return null;		
	}
	    
	public UnidadeDistancia getAnterior(UnidadeDistancia unidadeDistancia)
	{		 
		 UnidadeDistancia udAnterior = null;
		 for (UnidadeDistancia ud: mapa)
		 {
			 if (ud == unidadeDistancia)
				 return udAnterior;
			 udAnterior = ud;			 					
		 }		 
		 return null;		
	}

	public UnidadeDistancia getAnterior()
	{		 
		 UnidadeDistancia udAnterior = null;
		 for (UnidadeDistancia ud: mapa)
		 {
			 if (ud.getCaminhao() != null)
				 return udAnterior;
			 udAnterior = ud;			 					
		 }		 
		 return null;		
	}
	
	public UnidadeDistancia getAtual()
	{		 
		 for (UnidadeDistancia ud: mapa)
		 {
			 if (ud.getCaminhao() != null)
				 return ud;			 		 					
		 }		 
		 return null;		
	}
	
	public Iterator<UnidadeDistancia> getIteratorColecao() 
	{
		 if (mapa == null)
			 mapa = new HashSet<UnidadeDistancia>();
		 return mapa.iterator();
	}   
	 
	public void set(Collection<UnidadeDistancia> novo) 
	{
		 removeAllunidadeDistancia();
		 for (Iterator<UnidadeDistancia> iter = novo.iterator(); iter.hasNext();)
			 add(iter.next());
	}
	   
	 /** @param novo */
	public void add(UnidadeDistancia novo) 
	{
		 if (novo == null)
			 return;
		 if (this.mapa == null)
			 this.mapa = new HashSet<UnidadeDistancia>();
		 if (!this.mapa.contains(novo))
			 this.mapa.add(novo);
	}
	   
	/** @param old */
	public void remove(UnidadeDistancia old) 
	{
		 if (old == null 
				 && this.mapa != null 
				 && this.mapa.contains(old))
		 	this.mapa.remove(old);
	}   
	   
	public void removeAllunidadeDistancia() 
	{
	      if (mapa != null)
	    	  mapa.clear();
	}

	@Override
	public String toString() 
	{
	
		if (mapa.size() > 0)			
			return "\n Mapa: " + 
				mapa + "\n";
		else
			return "\n Mapa: " + 
				"\n   - Não inicializado!!! \n";	

	} 
}