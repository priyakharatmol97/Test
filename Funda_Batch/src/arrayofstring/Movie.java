package arrayofstring;

public class Movie
{
	int mid,releaseYear,boxOfficeCollection;
	String movieName,producer;
	
	Movie(int mid,String movieName,int releaseYear,int boxOfficeCollection,String producer)
	{
		this.mid=mid;
		this.movieName=movieName;
		this.releaseYear=releaseYear;
		this.boxOfficeCollection=boxOfficeCollection;
		this.producer=producer;
	}
	
	public String toString()
	{
		return mid+" "+movieName+" "+releaseYear+" "+boxOfficeCollection+" "+producer;
	}

}
