package foo;

import java.util.Date;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class Resource_Manager_Test_Resources
{
	All_Resources all_resources;
	
	private Resource	printer, printer2, printer3,
						data_show, data_show2,
						pc, pc2;
	
	@Before
	public void before()
	{
		all_resources = new All_Resources();
		
		printer = new Printer();
		printer2 = new Printer();
		data_show = new Data_Show();
		pc = new Laptop();
		
		printer.set_code("hp0001");
		printer.set_description("Esta impressora é de uso livre de todos.");
		printer.set_name("Impressora 1");
		printer.set_permition_level(5);
		
		printer2.set_code("hp0002");
		printer2.set_description("Esta impressora é de uso livre de todos.");
		printer2.set_name("Impressora 2");
		printer2.set_permition_level(5);
		
		data_show.set_code("ds0001");
		data_show.set_description("Este peojetor é de uso exclusivo dos professores.");
		data_show.set_name("Projetor 1");
		data_show.set_permition_level(2);
		
		pc.set_code("pc0001");
		pc.set_description("Este pc é de uso exclusivo dos alunos.");
		pc.set_name("PC 1");
		pc.set_permition_level(1);
		
		all_resources.get_list().add(printer);
		all_resources.get_list().add(printer2);
		all_resources.get_list().add(data_show);
		all_resources.get_list().add(pc);

	}
	
	@org.junit.Test
	public void test_resources_list_not_null()
	{			
		Assert.assertNotNull(all_resources.get_list());
	}
	
	@org.junit.Test
	public void test_if_resources_on_the_list()
	{		
		Assert.assertTrue(all_resources.get_list().contains(printer));
		Assert.assertTrue(all_resources.get_list().contains(printer2));
		Assert.assertTrue(all_resources.get_list().contains(data_show));
		Assert.assertTrue(all_resources.get_list().contains(pc));
	}
	
	@org.junit.Test
	public void test_if_resources_not_on_the_list()
	{
		Assert.assertFalse(all_resources.get_list().contains(printer3));
		Assert.assertFalse(all_resources.get_list().contains(data_show2));
		Assert.assertFalse(all_resources.get_list().contains(pc2));
		
	}

}

