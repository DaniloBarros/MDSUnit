package br.com.unb.carro.control;

import br.com.unb.carro.model.Cambio;

public class FabricadeCambio {

	public Cambio fabricarCambio(String tipo) {
		
		if(tipo.equalsIgnoreCase("Manual"))
		{
			return new Cambio(tipo);
		}
		else
		{
			if(tipo.equalsIgnoreCase("Automático"))
			{
			
				return new Cambio(tipo);
			}
			else
			{
				return null;
			}
		}
	}

}
