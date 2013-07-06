package br.com.unb.carro.test.unit;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.unb.carro.control.FabricadeMotores;
import br.com.unb.carro.model.Motor;

public class TestFabricadeMotores {

	 FabricadeMotores fabricadeMotores;
	 Motor motor;

	@Before
	public void setUp() {
		fabricadeMotores = new FabricadeMotores();
		
	}
	
	@Test
	public void testMotorInexistente()
	{
	
		motor = fabricadeMotores.fabricarMotor(2000);
		Assert.assertNull("O motor de cilindrada 2000 foi fabricado", motor);
		
	}
	
	@Test
	public void testMotor1400()
	{
		motor = fabricadeMotores.fabricarMotor(1400);
		Assert.assertNotNull("O motor não foi fabricado", motor);
		Assert.assertEquals("O motor não possui 1400 ml de cilindrada",1400, motor.getCilindrada());
	}
	
	@Test
	public void testMotor1000()
	{
		motor = fabricadeMotores.fabricarMotor(1000);
		Assert.assertNotNull("O motor não foi fabricado", motor);
		Assert.assertEquals("O motor não possui 1000 ml de cilindrada",1000, motor.getCilindrada());
	}
	
	@Test
	public void testMotor1600()
	{
		motor = fabricadeMotores.fabricarMotor(1600);
		Assert.assertNotNull("O motor não foi fabricado", motor);
		Assert.assertEquals("O motor não possui 1600 ml de cilindrada",1600, motor.getCilindrada());
	}

}
