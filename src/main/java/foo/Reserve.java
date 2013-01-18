package foo;



import java.util.ArrayList;
import java.util.Date;

public class Reserve
{
	private Functionary functionary;
	private Date firt_day;
	private Date last_day;
	
	private ArrayList<Resource> reserved_itens;
	
	public Reserve()
	{
		//user = new User();
		set_functionary(new Functionary());
		reserved_itens = new ArrayList<Resource>();
	}

	public ArrayList<Resource> get_list()
	{
		return reserved_itens;
	}
	
	public Date get_firt_day()
	{
		return firt_day;
	}

	public void set_firt_day(Date _firt_day)
	{
		this.firt_day = _firt_day;
	}

	public Date get_last_day()
	{
		return last_day;
	}
	
	public void set_last_day(Date _last_day)
	{
		this.last_day = _last_day;
	}

	public Functionary get_functionary()
	{
		return functionary;
	}

	public void set_functionary(Functionary functionary)
	{
		this.functionary = functionary;
	}

}