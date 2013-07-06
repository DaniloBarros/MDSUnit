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
			fabricadeMotores = new FabricadeMotores();
			fabricadeRoda = new FabricadeRodas();
			fabricadeCambio = new FabricadeCambio();
			
			
			Motor motor = fabricadeMotores.fabricarMotor(1000);
			
			ArrayList<Roda> rodas = new ArrayList<Roda>();
			
			for(int i=0; i<4; i++)
			{
				rodas.add(fabricadeRoda.fabricarRoda(13));
			}
			Cambio cambio = fabricadeCambio.fabricarCambio("Manual");
			
			
			return juntarPecas(modelo,rodas,motor,cambio);
			
			
			
		}
		
		if (modelo.equalsIgnoreCase("Attractive 1.4"))
		{
			fabricadeMotores = new FabricadeMotores();
			fabricadeRoda = new FabricadeRodas();
			fabricadeCambio = new FabricadeCambio();
			
			
			Motor motor = fabricadeMotores.fabricarMotor(1400);
			
			ArrayList<Roda> rodas = new ArrayList<Roda>();
			
			for(int i=0; i<4; i++)
			{
				rodas.add(fabricadeRoda.fabricarRoda(15));
			}
			Cambio cambio = fabricadeCambio.fabricarCambio("Manual");
			
			return juntarPecas(modelo,rodas,motor,cambio);
		}
		
		
		if(modelo.equalsIgnoreCase("Sporting Manual"))
		{
			fabricadeMotores = new FabricadeMotores();
			fabricadeRoda = new FabricadeRodas();
			fabricadeCambio = new FabricadeCambio();
			
			
			Motor motor = fabricadeMotores.fabricarMotor(1600);
			
			ArrayList<Roda> rodas = new ArrayList<Roda>();
			
			for(int i=0; i<4; i++)
			{
				rodas.add(fabricadeRoda.fabricarRoda(16));
			}
			Cambio cambio = fabricadeCambio.fabricarCambio("Manual");
			
			return juntarPecas(modelo,rodas,motor,cambio);
		
		}
		
		if(modelo.equalsIgnoreCase("Sporting Automático"))
		{
			fabricadeMotores = new FabricadeMotores();
			fabricadeRoda = new FabricadeRodas();
			fabricadeCambio = new FabricadeCambio();
			
			
			Motor motor = fabricadeMotores.fabricarMotor(1600);
			
			ArrayList<Roda> rodas = new ArrayList<Roda>();
			
			for(int i=0; i<4; i++)
			{
				rodas.add(fabricadeRoda.fabricarRoda(16));
			}
			Cambio cambio = fabricadeCambio.fabricarCambio("Automático");
			
			return juntarPecas(modelo,rodas,motor,cambio);
		}
		return null;
		
	}



	public Carro juntarPecas(String modelo, ArrayList<Roda> rodas, Motor motor,
			Cambio cambio) {
		return new Carro(modelo,rodas,motor,cambio);
		
	}

}
