package foo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses
	({
	Resource_Manager_Test_Users.class,
	Resource_Manager_Test_Resources.class,
	Resource_Manager_Test.class
	})

public class AllTests {

}
