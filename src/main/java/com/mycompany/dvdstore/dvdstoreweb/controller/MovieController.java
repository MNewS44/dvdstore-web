package com.mycompany.dvdstore.dvdstoreweb.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class MovieController implements MovieControllerInterface{
    public MovieController(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    private final MovieServiceInterface movieService;

    public void addUsingConsole(){
        System.out.println("Saisir le titre du film : ");
        Scanner sc = new Scanner(System.in);
        String titre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(titre);

        System.out.println("Saisir le genre du film : ");
        String genre = sc.nextLine();
        movie.setGenre(genre);

        movieService.registerMovie(movie);
    }
}
