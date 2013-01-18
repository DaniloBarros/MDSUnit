package foo;



import java.util.Date;

public class Resource
{
	private String name;
	private String description;
	private String code;
	private int permition_level; 
	/**
	 * os niveis de permissão vão de 1 à 7:
	 * aluno - 1
	 * professor - 2
	 * funcionário - 3
	 * aluno e professor - 4
	 * aluno e funcionário - 5
	 * professor e funcionário - 6
	 * aluno, professor e funcionário - 7
	 */				     
	private Reserve reserve;
	private int state;
		
	public void set_name(String _name)
	{
		this.name = _name;
	}
	
	public void set_description(String _description)
	{
		this.description = _description;
	}
	
	public void set_permition_level(int _permition_level)
	{
		this.permition_level = _permition_level;
	}
	
	public void set_code(String _code)
	{
		this.code = _code;
	}
	
	public void set_reserve(Reserve _reserve)
	{
		this.reserve = _reserve;
	}
	
	public void set_state(int _state)
	{
		this.state = _state;
	}
	
	public String get_code()
	{
		return code;
	}

	public String get_name()
	{
		return name;
	}

	public String get_description()
	{
		return description;
	}

	public int get_permition_level()
	{
		return permition_level;
	}

	public Reserve get_reserve()
	{
		return reserve;
	}

	public boolean is_avaliable(Date date)
	{
		if(this.reserve == null )
			return true;
		else
		if((this.reserve.get_last_day().before(date) || this.reserve.get_firt_day().after(date))
				&& this.state == 0)
			return true;
		else
			return false;
		
	}
}
