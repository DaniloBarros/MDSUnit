package foo;

import java.util.Date;


public class Teacher extends User
{
	
	@Override
	public boolean has_permition(Resource resource) 
	{
		if(resource.get_permition_level() == 2 ||
				resource.get_permition_level() == 4 ||
						resource.get_permition_level() == 6 || 
								resource.get_permition_level() == 7)
		   return true;
		else
			return false;
	}

	@Override
	public void reserve_a_resource(Resource resource, Functionary func) 
	{
		if(this.has_permition(resource))
		{
			Date date_today = new Date();
			Date last_day = new Date(date_today.getYear(), date_today.getMonth(), date_today.getDate() + 20);
			
			Reserve reserve = new Reserve();
			reserve.get_list().add(resource);
			reserve.set_firt_day(date_today);
			reserve.set_last_day(last_day);
			reserve.set_functionary(func);

			resource.set_state(1);
			resource.set_reserve(reserve);

			this.get_list().add(reserve);
		}
		else
			return;
		
	}

	@Override
	public void cancel_a_reserve(Resource resource)
	{
		for(int i = 0; i < this.get_list().size(); i++)
		{
			for(Resource r: this.get_list().get(i).get_list())
			{
				Reserve reserve = this.get_list().get(i);
				
				if(r.equals(resource))
					this.get_list().remove(reserve);
			}
		}
		
		resource.set_reserve(null);
		resource.set_state(0);
		
	}

	


}
