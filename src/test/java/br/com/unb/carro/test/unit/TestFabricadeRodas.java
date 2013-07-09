package br.com.unb.carro.test.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.unb.carro.control.FabricadeRodas;
import br.com.unb.carro.model.Roda;


/**
 * 
 * @author Guilherme
 *
 */
public class TestFabricadeRodas {
	
	
	FabricadeRodas fabricadeRodas;
	int aro;
	Roda roda;

	@Before
	public void setUp()
	{
		fabricadeRodas = new FabricadeRodas();
		
	}
	
	@Test
	public void testRodaInexistente()
	{
		aro = 28;
		roda = fabricadeRodas.fabricarRoda(aro); 
		Assert.assertNull("Foi fabricada uma roda nula", roda);
	}
	
	@Test
	public void testRodaAro13()
	{
		aro = 13;
		roda = fabricadeRodas.fabricarRoda(aro); 
		Assert.assertNotNull(roda);
		Assert.assertEquals("A roda não possui aro 13", aro, roda.getAro());
	}
	
	@Test
	public void testRodaAro15()
	{
		aro = 15;
		roda = fabricadeRodas.fabricarRoda(aro); 
		Assert.assertNotNull(roda);
		Assert.assertEquals("A roda não possui aro 15", aro, roda.getAro());
	}
	
	
	@Test
	public void testAro16()
	{
		aro = 16;
		roda = fabricadeRodas.fabricarRoda(aro); 
		Assert.assertNotNull(roda);
		Assert.assertEquals("A roda não possui aro 16", aro, roda.getAro());
	}
	
	

}
