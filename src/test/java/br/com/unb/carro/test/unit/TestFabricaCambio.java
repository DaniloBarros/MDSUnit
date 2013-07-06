package br.com.unb.carro.test.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.unb.carro.control.FabricadeCambio;
import br.com.unb.carro.model.Cambio;

/**
 * 
 * @author Guilherme Baufaker
 *
 */
public class TestFabricaCambio {
	
	FabricadeCambio fabricaCambio;
	Cambio cambio;
	String tipo;
	
	@Before
	public void setUp()
	{
		fabricaCambio = new FabricadeCambio();
	}
	
	@Test
	public void testCambioInexistente ()
	{
		tipo = "nulo";
		cambio = fabricaCambio.fabricarCambio(tipo);
		Assert.assertNull("O câmbio nulo foi fabricado", cambio);
	}
	
	
	@Test
	public void testCambioManual()
	{
		tipo = "Manual";
		cambio = fabricaCambio.fabricarCambio(tipo);
		Assert.assertNotNull("O câmbio Manual não foi fabricado", cambio);
	}
	
	@Test
	public void testCambioAutomatico()
	{
		tipo = "Automático";
		cambio = fabricaCambio.fabricarCambio(tipo);
		Assert.assertNotNull("O câmbio Automático não foi fabricado", cambio);
	}

}
