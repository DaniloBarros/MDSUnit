package br.com.unb.carro.control;


import br.com.unb.carro.model.Roda;

/*
 *
 * @author Guilherme Baufaker
 */

public class FabricadeRodas {

	public Roda fabricarRoda(int aro) {

		switch (aro) {
		case 13:
			return new Roda(13);

		case 15:
			return new Roda(15);

		case 16:
			return new Roda(16);

		default:
			return null;
		}

	}
}
