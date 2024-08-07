package estabelecimento;

import funcionalidades.ligador.Ligador;
import funcionalidades.ligador.Phone;
import funcionalidades.navegador.Internet;
import funcionalidades.navegador.Navegador;
import funcionalidades.smartphone.IPhone;
import funcionalidades.tocador.IPod;
import funcionalidades.tocador.Tocador;

public class Loja {
	public static void main(String[] args) {
		//Executando como equipamento individual (Comentar o bloco IPhone)
		
		Tocador tocador = new IPod();
		tocador.tocar();
		
		Ligador ligador = new Phone();
		ligador.ligar();
		
		Navegador navegador = new Internet();
		navegador.navegar();
		
		//Executando como IPhone (Comentar o bloco acima)
		
		//IPhone ip = new IPhone();
		//Tocador tocador = ip;
		//Ligador ligador = ip;
		//Navegador navegador = ip;
		
		//tocador.tocar();
		//ligador.ligar();
		//navegador.navegar();
	}
}