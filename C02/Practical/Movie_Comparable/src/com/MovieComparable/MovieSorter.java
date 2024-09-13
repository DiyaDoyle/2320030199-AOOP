package com.MovieComparable;
import java.util.*;

public class MovieSorter {

    public static void main(String[] args) {
        // Creating a list of movies
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("The Godfather", 9.2, 1972));
        movies.add(new Movie("Pulp Fiction", 8.9, 1994));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("Fight Club", 8.8, 1999));

        // Printing unsorted list
        System.out.println("Unsorted Movies:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        // Sorting movies by year
        Collections.sort(movies);

        // Printing sorted list
        System.out.println("\nSorted Movies by Year:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
