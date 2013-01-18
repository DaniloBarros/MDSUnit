package foo;

import java.util.ArrayList;
import java.util.Date;

public abstract class User
{
	int id;
	String name;
	private ArrayList<Reserve> reserve_list;
	
	public User()
	{
		reserve_list = new ArrayList<Reserve>();
	}
	
	public ArrayList<Reserve> get_list()
	{
		return reserve_list;
	}
	
	public void set_name(String _name)
	{
		this.name = _name;
	}
	
	public void set_id(int _id)
	{
		this.id = _id;
	}
	
	public String get_name()
	{
		return name;
	}
	
	public int get_id()
	{
		return id;
	}
	
	public abstract boolean has_permition(Resource resource);
	public abstract void reserve_a_resource(Resource res, Functionary func);
	public abstract void cancel_a_reserve(Resource resource);
	
}

