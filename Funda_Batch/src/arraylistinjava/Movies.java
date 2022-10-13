package arraylistinjava;

public class Movies implements Comparable<Movies>
{
	Integer m_id,m_bcollection;
	String m_name;
	Float m_rating;
	
	public Movies(Integer m_id,String m_name,Integer m_bcollection,Float m_rating)
	{
		this.m_id=m_id;
		this.m_bcollection=m_bcollection;
		this.m_name=m_name;
		this.m_rating=m_rating;
	}
	
	public String toString()
	{
		return m_id+" "+m_bcollection+" "+m_name+" "+m_rating;
	}

	@Override
	public int compareTo(Movies o) 
	{
		return this.m_name.compareTo(o.m_name);
	}
	

}
