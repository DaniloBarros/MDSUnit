package foo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Resource_Manager_Test_Users {

	private All_Users all_users;
	private User student, student2, student3;
	private User teacher, teacher2;
	private User functionary, functionary2;
	
	@Before
	public void create_users()
	{
		all_users = new All_Users();
		
		student = new Student();
		student2 = new Student();
		student3 = new Student();
		
		teacher = new Teacher();
		teacher2 = new Teacher();
		
		functionary = new Functionary();
		functionary2 = new Functionary();
		
		student.set_id(100);
		student.set_name("Fulano");
		
		teacher.set_id(200);
		teacher.set_name("Ciclano");
		
		functionary.set_id(300);
		functionary.set_name("Beltrano");
		
		all_users.get_list().add(student);
		all_users.get_list().add(teacher);
		all_users.get_list().add(functionary);
	}
	
	
	@org.junit.Test
	public void test_users_list_not_null()
	{			
		Assert.assertNotNull(all_users.get_list());
	}
	
	@org.junit.Test 
	public void test_if_users_on_the_list()
	{		
		Assert.assertTrue(all_users.get_list().contains(student));	
		Assert.assertTrue(all_users.get_list().contains(teacher));	
		Assert.assertTrue(all_users.get_list().contains(functionary));
	}
	
	@org.junit.Test
	public void test_if_users_not_on_the_list()
	{
		Assert.assertFalse(all_users.get_list().contains(student2));
		Assert.assertFalse(all_users.get_list().contains(student3));
		Assert.assertFalse(all_users.get_list().contains(teacher2));
		Assert.assertFalse(all_users.get_list().contains(functionary2));
	}
	
}
