package exercicios;

public class Televisor {
	
	private int canal;
	private int volume;
	private boolean ligado;
	
	public Televisor() {
		this.canal = 1;
		this.volume = 0;
		this.ligado = false;
	}
	
	public void aumentarVolume() {
		if(this.ligado == true) {
			if(volume < 10) {
				this.volume += 1;
			}else {
					System.out.println("Aviso, você atingiu o volume máximo!");
				}
			System.out.println("O volume atual é: " + volume);
		}	
	}
	
	public void reduzirVolume() {
		if(this.ligado == true) {
			if(volume > 0) {
				this.volume -= 1;
			}else {
				System.out.println("Aviso, você atingiu o volume mínimo!");
			}
			System.out.println("O volume atual é: " + volume);
			
		}
	}
	
	public void subirCanal() {
		if(this.ligado == true) {
			if(canal < 16) {
				this.canal += 1;
			}else {
				System.out.println("Aviso, você atingiu o canal máximo!");
			}
			System.out.println("O canal atual é: " + canal);
		}
	}
	
	public void descerCanal() {
		if(this.ligado == true) {
			if(canal > 1) {
				this.canal -= 1;
			}else {
				System.out.println("Aviso, você atingiu o canal mínimo!");
			}
			System.out.println("O canal atual é: " + canal);	
		}
	}
	
	public void ligarTelevisor() {
		this.ligado = true;
		System.out.println("Liga a televisão: " + this.ligado);
	}
	
	public void desligarTelevisor() {
		this.ligado = false;
		this.canal = 1;
		this.volume = 0;
		System.out.println("Desliga a televisão: " + this.ligado);
	}		
	
	public void mostrarStatus() {
		System.out.println("O canal atual é o: " + this.canal + ", o volume atual é: " + this.volume + ", a televisão está ligada?: " + this.ligado);
	}
	
}
