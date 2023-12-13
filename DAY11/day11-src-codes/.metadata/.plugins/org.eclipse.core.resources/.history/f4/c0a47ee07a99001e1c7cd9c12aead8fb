import java.util.ArrayList;
import java.util.Collections;

// Sort the movie based on year field
// Movie class is implemented class for the Comparable interface 

class Movie implements Comparable<Movie>
{
	private double rating;
	private int year;
	private String name;
	
	public Movie(double rating, int year, String name) 
	{
		super();
		this.rating = rating;
		this.year = year;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", year=" + year + ", name=" + name + "]";
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Movie m)
	{
		return this.year - m.year;
	}
	
	
	
} // end of Movie class


public class Day11_7 {

	public static void main(String[] args) 
	{
		ArrayList<Movie> al = new ArrayList<Movie>();
		Movie m1 = new Movie(4.5,2023,"movie1");
		Movie m2 = new Movie(3.5,2022,"movie2");
		Movie m3 = new Movie(2.8,2024,"movie3");
		Movie m4 = new Movie(3.9,2021,"movie4");
		
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		
		for(Movie m : al)
			System.out.println(m);
		
		Collections.sort(al);
		
		System.out.println("Sorted Data ");
		for(Movie m : al)
			System.out.println(m);
		

	}

}
