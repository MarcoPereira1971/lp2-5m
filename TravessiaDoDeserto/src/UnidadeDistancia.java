public class UnidadeDistancia {
   private int combustivel;   
   private Caminhao caminhao;
   private Mapa mapa;

   public void setCaminhao(Caminhao caminhao) {
	this.caminhao = caminhao;
	if (this.caminhao == null) return;
	this.caminhao.setUnidadeDistancia(this);
   }
   
   
   public Caminhao getCaminhao() {
	return caminhao;
}

public UnidadeDistancia(Mapa mapa)
   {
	   combustivel = 0;
	   this.mapa = mapa;
   }   

   /** @param combustivel*/
   public void depositar(int combustivel) {      
	   this.combustivel+=combustivel;      
   }   
   /** @param combustivel */
   public boolean retirar(int combustivel) {
	   	   
	   if ((this.combustivel-combustivel)>=0)
	   {
		   this.combustivel-=combustivel;
		   return true;
	   }
	   return false;
   }
@Override
public String toString() {
	/*
	return "UnidadeDistancia [combustivel=" + combustivel + ", caminhao="
			+ caminhao + "]";
			
	*/
	if (caminhao != null)
		return caminhao.toString();
	else
		return "__ ";
}
   
   

}