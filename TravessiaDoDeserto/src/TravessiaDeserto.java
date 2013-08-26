
public class TravessiaDeserto {

	private boolean jogoAcabou;
	private final static String Menu = "" +
			"Digite uma das Seguintes Opcoes: " +
			"avancar, recuar, descarregar ou carregar: \n";
	private static Mapa mapa;
	private static Caminhao caminhao;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TravessiaDeserto tD = new TravessiaDeserto();
		mapa = new Mapa();
		caminhao = mapa.getCaminhao();
		caminhao.carregar(5);
				
		do{
			Console.print(tD.imprimeStatus());
			Console.print("\n");
			String opcao = getOpcao();
			switch (opcao) {
			case "AVANCAR":
				caminhao.avancar(1);
				//Console.print("Avancar\n");
				break;

			case "RECUAR":				
				Console.print("Recuar\n");
				break;
				
			case "DESCARREGAR":				
				Console.print("Descarregar\n");
				break;

			case "CARREGAR":				
				Console.print("Carregar\n");				
				break;

			default:
				Console.print("Opcao Invalida\n");
				break;
			}
	
		} while(!tD.jogoAcabou);		
	}
	
	private static String getOpcao() {
		// TODO Auto-generated method stub
		return Console.scanString(Menu);
	}	
	private String imprimeStatus() {
		return mapa.toString();
	}

}
