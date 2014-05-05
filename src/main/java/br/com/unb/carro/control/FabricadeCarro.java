package br.com.unb.carro.control;

import java.util.ArrayList;

import br.com.unb.carro.model.Cambio;
import br.com.unb.carro.model.Carro;
import br.com.unb.carro.model.Motor;
import br.com.unb.carro.model.Roda;

/**
 * 
 * @author Guilherme
 *	Possivel Refactor Nesta Classe 
 *
 *
 */
public class FabricadeCarro {
	
	

	private FabricadeMotores fabricadeMotores;
	private FabricadeRodas fabricadeRoda;
	private FabricadeCambio fabricadeCambio;

	
	
	public Carro montarCarro (String modelo) {
		
		if(modelo.equalsIgnoreCase("Attractive 1.0"))
		{

			return juntarPecas(modelo,fabricarRoda(13),fabricarMotor(1000),fabricarCambio("Manual"));
			
			
			
		}
		
		if (modelo.equalsIgnoreCase("Attractive 1.4"))
		{
			return juntarPecas(modelo,fabricarRoda(15),fabricarMotor(1400),fabricarCambio("Manual"));
		}
		
		
		if(modelo.equalsIgnoreCase("Sporting Manual"))
		{
			return juntarPecas(modelo,fabricarRoda(16),fabricarMotor(1600),fabricarCambio("Manual"));
		
		}
		
		if(modelo.equalsIgnoreCase("Sporting Automático"))
		{
			return juntarPecas(modelo,fabricarRoda(16),fabricarMotor(1600),fabricarCambio("Automático"));
		}
		return null;
		
	}



	private Cambio fabricarCambio(String tipo) {
		fabricadeCambio = new FabricadeCambio();
		Cambio cambio = fabricadeCambio.fabricarCambio(tipo);
		return cambio;
	}



	private ArrayList<Roda> fabricarRoda(int aro) {
		fabricadeRoda = new FabricadeRodas();

		ArrayList<Roda> rodas = new ArrayList<Roda>();
		
		for(int i=0; i<4; i++)
		{
			rodas.add(fabricadeRoda.fabricarRoda(aro));
		}
		return rodas;
	}



	private Motor fabricarMotor(int cilindrada) {
		fabricadeMotores = new FabricadeMotores();
		return fabricadeMotores.fabricarMotor(cilindrada);
	}



	public Carro juntarPecas(String modelo, ArrayList<Roda> rodas, Motor motor,
			Cambio cambio) {
		return new Carro(modelo,rodas,motor,cambio);
		
	}

}
