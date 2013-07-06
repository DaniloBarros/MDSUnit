package br.com.unb.carro.control;

import br.com.unb.carro.model.Cambio;

public class FabricadeCambio {

	public Cambio fabricarCambio(String tipo) {
		
		switch (tipo) {
		case "Manual":
			return new Cambio(tipo);
		
		case "Automático":
			return new Cambio(tipo);
			
		default:
			return null;
		}
	}

}
