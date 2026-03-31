package JavaStreams;

import java.util.*;
import java.util.stream.Collectors;
class Movie{
	String name;
	double rating;
	int year;
	
	Movie(String name , double rating , int year){
		this.name=name;
		this.rating=rating;
		this.year=year;
	}
	
	public String toString(){
		return name + " | Rating: " + rating + " | Year: " + year;
	}
}

public class TrendingMovies {
	public static void main(String[] args) {
		List<String> movies = Arrays.asList(
			    "The Shawshank Redemption,9.3,1994",
			    "The Dark Knight,9.0,2008",
			    "Inception,8.8,2010",
			    "Interstellar,8.7,2014",
			    "Parasite,8.5,2019",
			    "Avengers: Endgame,8.4,2019",
			    "Joker,8.4,2019",
			    "Dune,8.0,2021",
			    "Oppenheimer,8.6,2023",
			    "Spider-Man: Across the Spider-Verse,8.6,2023",
			    "12th Fail,9.2,2023",
			    "RRR,7.8,2022",
			    "KGF Chapter 2,8.3,2022",
			    "Drishyam 2,8.2,2022",
			    "John Wick 4,7.7,2023",
			    "The Godfather,9.2,1972",
			    "Fight Club,8.8,1999",
			    "The Matrix,8.7,1999",
			    "Your Name,8.4,2016",
			    "Coco,8.4,2017"
			);
		List<Movie> movieList = movies.stream().map(line ->{
			String[] parts = line.split(",");
			String name = parts[0];
			double rating = Double.parseDouble(parts[1]);
			int year = Integer.parseInt(parts[2]);
			return new Movie(name , rating , year);
		}).collect(Collectors.toList());
		
		List<Movie> result = movieList.stream().sorted(Comparator.comparingDouble((Movie m)->m.rating).reversed().thenComparingInt((Movie m)->m.year).reversed()).limit(5).collect(Collectors.toList());
		result.forEach(System.out::println);

	}
}

