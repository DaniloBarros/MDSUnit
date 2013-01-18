package foo;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class Resource_Manager_Test {
	
	All_Resources all_resources;
	All_Users all_users;
	User professor;
	User aluno;
	Functionary functionary;
	Resource data_show;
	
	@Before
	public void before()
	{
		all_resources = new All_Resources();
		all_users = new All_Users();
		
		professor = new Teacher();
		professor.set_id(200);
		professor.set_name("Fulano de Tal");
		
		functionary = new Functionary();
		functionary.set_id(200);
		functionary.set_name("Beltrano de Tal");
		
		all_users.get_list().add(professor);
		all_users.get_list().add(functionary);
		
		data_show = new Data_Show();
		data_show.set_code("ds01");
		data_show.set_description("Este projetor é exclusivo dos professores");
		data_show.set_name("Projetor 1");
		data_show.set_permition_level(2);
		
		all_resources.get_list().add(data_show);
		
		professor.reserve_a_resource(data_show, functionary);
		
	}
	
	
	@org.junit.Test
	public void test_if_resource_not_avaliable_in_a_date()
	{
		Date date = new Date(2012, 8, 27);
		Date date2 = new Date(2012, 8, 30);
		
		Assert.assertFalse( data_show.is_avaliable(date) );
		Assert.assertFalse( data_show.is_avaliable(date2) );
	}
	
	@org.junit.Test
	public void test_if_reserve_is_ok()
	{
		Date date_today = new Date();
		Date last_day = new Date(date_today.getYear(), date_today.getMonth(), date_today.getDate() + 20);
	
		Reserve res = new Reserve();
		res = professor.get_list().get(0);
		
		Assert.assertNotNull(res.get_list());
		Assert.assertEquals(res.get_firt_day(), date_today);
		Assert.assertEquals(res.get_last_day(), last_day);
		Assert.assertSame(res.get_functionary(), functionary);
		
	}
	
	@org.junit.Test
	public void test_if_student_reserve_datashow(){
		Reserve res = new Reserve();
		aluno = new Student();
		//aluno.reserve_a_resource(data_show, functionary);
		Assert.assertFalse(aluno.has_permition(data_show));
	}
	
	
	@org.junit.Test
	public void test_cancel_a_reserve()
	{
		professor.cancel_a_reserve(data_show);
		
		Date date = new Date(2012,8,14);
		
		Assert.assertTrue(data_show.is_avaliable(date));
	}
	
}
