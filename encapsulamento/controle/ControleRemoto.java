package encapsulamento.controle;

public class ControleRemoto implements Controlador{
	private int volume;
	private boolean ligado;
	private boolean tocando;
	private boolean menuAberto;
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
		this.menuAberto = false;
	
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
		public boolean isMenuAberto() {
		return menuAberto;
	}

	public void setMenuAberto(boolean menuAberto) {
		this.menuAberto = menuAberto;
	}

	//Métodos Abstratos
	@Override
	public void ligar() {
		if (! this.getLigado()) {
		this.setLigado(true);
		} else {
			System.out.println( "Seu controle já está ligado!!!" );
		}
	}

	@Override
	public void desligar() {
		if (this.getLigado()) {
		this.setLigado(false);
		} else {
			System.out.println( "Seu controle já está desligado!!!" );
		}
	}

	@Override
	public void abrirMenu() {
		if (this.getLigado()&& ! this.isMenuAberto()) {
			this.setMenuAberto(true);
			System.out.println( "---MENU---" );
			System.out.println("Está Tocando?R: " + this.getTocando());
			System.out.print("Volume:" + this.getVolume());
					for(int i = 0 ; i <= this.getVolume(); i+=10) {
						System.out.print("|||||");
					} 
					} else {
						System.out.println( "IMPOSSÍVEL REALIZAR ESSA AÇÃO!!!" );
					}
		System.out.println( "" );
				}
		
	
		
	@Override
	public void fecharMenu() {
		 if (this.getLigado()&& this.isMenuAberto()) {
		System.out.println("Fechando Menu");
		 }else {
				System.out.println( "IMPOSSÍVEL REALIZAR ESSA AÇÃO!!!" );
			}
	}

	@Override
	public void maisVolume() {
		if(this.getLigado() ) {
			this.setVolume(this.getVolume()+1);
		}else {
			System.out.println( "IMPOSSÍVEL REALIZAR ESSA AÇÃO!!!" );
		}
	}

	@Override
	public void menosVolume() {
		if(this.getLigado() && this.getVolume() > 1 ) {
			this.setVolume(this.getVolume()-1);
		}else {
			System.out.println( "IMPOSSÍVEL REALIZAR ESSA AÇÃO!!!" );
		}
		
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 1) {
			this.setVolume(0);
		}else {
			System.out.println( "IMPOSSÍVEL REALIZAR ESSA AÇÃO!!!" );
		}
		
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
			
		
	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())){
			 	this.setTocando(true);
		} else {
			System.out.println( "IMPOSSÍVEL REALIZAR ESSA AÇÃO!!!" );
		}
		
	}

	@Override
	public void pause() {
		if (this.getLigado() && (this.getTocando())){
		 	this.setTocando(false);
		}else {
			System.out.println( "IMPOSSÍVEL REALIZAR ESSA AÇÃO!!!" );
		}
		
	}


}
