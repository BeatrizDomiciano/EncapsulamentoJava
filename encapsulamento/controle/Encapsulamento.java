package encapsulamento.controle;

public class Encapsulamento {

	public static void main(String[] args) {

			ControleRemoto c1 =  new ControleRemoto();
			
			System.out.println( "C1" );
			System.out.println( "" );
			
			c1.ligar();
			c1.maisVolume();
			c1.abrirMenu();
			c1.menosVolume();
			c1.menosVolume();
			c1.abrirMenu();
			
			System.out.println( "" );
			
			ControleRemoto c2 =  new ControleRemoto();
			
			System.out.println( "C2" );
			System.out.println( "" );
			
			c2.abrirMenu();
			c2.fecharMenu();
			c2.desligar();
			
			System.out.println( "" );
			
			ControleRemoto c3 =  new ControleRemoto();
			
			System.out.println( "C3" );
			System.out.println( "" );
			
			c3.ligar();
			c3.menosVolume();
			c3.menosVolume();
			c3.menosVolume();
			c3.menosVolume();
			c3.menosVolume();
			c3.abrirMenu();
			c3.fecharMenu();
			c3.desligar();
			
	}
  
}
