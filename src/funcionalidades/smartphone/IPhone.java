package funcionalidades.smartphone;

import funcionalidades.ligador.Ligador;
import funcionalidades.navegador.Navegador;
import funcionalidades.tocador.Tocador;

public class IPhone implements Tocador, Ligador, Navegador  {
	public void tocar() {
		System.out.println("TOCANDO VIA EQUIPAMENTO IPHONE");
	}
	public void ligar() {
		System.out.println("LIGANDO VIA EQUIPAMENTO IPHONE");
	}
	public void navegar() {
		System.out.println("NAVEGANDO VIA EQUIPAMENTO IPHONE");
	}
}
