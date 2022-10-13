package arraylistinjava;

public class Movies_Q1 implements Comparable<Movies_Q1> 
{
	Integer m_id,m_bcollection;
	String m_name;
	Float m_rating;
	
	public Movies_Q1(Integer m_id,Integer m_bcollection,String m_name, float m_rating)
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
	public int compareTo(Movies_Q1 o) 
	{
		return this.m_name.compareTo("RRR");
	}
	
	
	
	

}

