package br.com.unb.test.integration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.unb.carro.control.FabricadeCarro;
import br.com.unb.carro.model.Carro;


public class TestFabricaCarroIntegration {

	
	FabricadeCarro fabricaCarro;
	Carro carro;

	@Before
	public void setUp()
	{
		

		fabricaCarro = new FabricadeCarro();
	}
	
	

	
	/**
	 * Testar o Modelo Attractive 1000
	 */
	@Test
	public void testAttractive1000 ()
	{
		String modelo = "Attractive 1.0";
		
		carro = fabricaCarro.montarCarro(modelo);
		
		//Se Objeto foi instanciado
		Assert.assertNotNull(carro);
		
		
		//Testando se o Modelo do Carro é o mesmo 
		Assert.assertTrue(carro.getModelo().equals(modelo));
		
		
		//Verificando se as quatro rodas possuem o mesmo tamanho
		for (int i=0; i<4; i++)
		{
			Assert.assertEquals(13, carro.getRodas().get(i).getAro());
		}
		
		//Testando o Motor do Carro se é 1000
		Assert.assertEquals(1000, carro.getMotor().getCilindrada());
		
		//Testando se o Cambio é Manual
		Assert.assertEquals("Manual", carro.getTransmissao().getTipo());
		
	}
	
	
	@Test
	public void testAttractive1400 ()
	{
		String modelo = "Attractive 1.4";
		
		carro = fabricaCarro.montarCarro(modelo);
		Assert.assertNotNull(carro);
		Assert.assertTrue(carro.getModelo().equals(modelo));
		
		
		//Verificando se as quatro rodas possuem o mesmo tamanho
		for (int i=0; i<4; i++)
		{
			Assert.assertEquals(15, carro.getRodas().get(i).getAro());
		}
		
		Assert.assertEquals(1400, carro.getMotor().getCilindrada());
		Assert.assertEquals("Manual", carro.getTransmissao().getTipo());
		
	}
	
	
	@Test
	public void testSportingManual ()
	{
		String modelo = "Sporting Manual";
		
		carro = fabricaCarro.montarCarro(modelo);
		Assert.assertNotNull(carro);
		Assert.assertTrue(carro.getModelo().equals(modelo));
		
		
		//Verificando se as quatro rodas possuem o mesmo tamanho
		for (int i=0; i<4; i++)
		{
			Assert.assertEquals(16, carro.getRodas().get(i).getAro());
		}
		
		Assert.assertEquals(1600, carro.getMotor().getCilindrada());
		Assert.assertEquals("Manual", carro.getTransmissao().getTipo());
		
	}
	
	@Test
	public void testSportingAutomatico ()
	{
		String modelo = "Sporting Automático";
		
		carro = fabricaCarro.montarCarro(modelo);
		Assert.assertNotNull(carro);
		Assert.assertTrue(carro.getModelo().equals(modelo));
		
		
		//Verificando se as quatro rodas possuem o mesmo tamanho
		for (int i=0; i<4; i++)
		{
			Assert.assertEquals(16, carro.getRodas().get(i).getAro());
		}
		
		Assert.assertEquals(1600, carro.getMotor().getCilindrada());
		Assert.assertEquals("Automático", carro.getTransmissao().getTipo());
		
	}
	
	
	//Testando um Carro fora dos Modelos previstos 
	@Test
	public void testCarroNulo()
	{
		String modelo = "Carro Qualquer";
		
		try{
		carro = fabricaCarro.montarCarro(modelo);
		}catch (Exception e)
		{
			System.out.println("O carro é nulo");
		}
	}
	
	
	
	//Testando dois objetos diferentes do mesmo modelo
	@Test
	public void testCarrosDiferentes()
	{
String modelo = "Sporting Automático";
		
		carro = fabricaCarro.montarCarro(modelo);
		Carro carro2 = fabricaCarro.montarCarro(modelo);
		
		Assert.assertNotSame(carro, carro2);
		Assert.assertNotSame(carro.getChassi(), carro2.getChassi());
	
	}

	


	
	
	
}
