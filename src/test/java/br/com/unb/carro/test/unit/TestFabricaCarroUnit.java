package br.com.carro.carro.test.unit;

import br.com.unb.carro.control.FabricadeCarro;
import br.com.unb.carro.model.Cambio;
import br.com.unb.carro.model.Carro;
import br.com.unb.carro.model.Motor;
import br.com.unb.carro.model.Roda;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;




public class TestFabricaCarroUnit {
	
	
	FabricadeCarro fabricaCarro;
	Motor motor;
	ArrayList<Roda> rodas;
	Cambio cambio;
	Carro carro;
	
	@Before
	public void setUp()
	{
		
		motor = mock(Motor.class);
		rodas = mock(ArrayList.class);
		
		for (int i=0; i<4; i++)
		{
			rodas.add(mock(Roda.class));
		}
		cambio = mock(Cambio.class);
		fabricaCarro = new FabricadeCarro();
	}
	
	@Test
	public void testFabricaCarroJuntarPecas() {
		Assert.assertNotNull("A fábrica não está juntando as peças para montar carros", fabricaCarro.juntarPecas("Modelo 1", rodas, motor, cambio));
	}

}
