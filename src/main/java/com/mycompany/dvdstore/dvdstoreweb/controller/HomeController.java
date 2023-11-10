package com.mycompany.dvdstore.dvdstoreweb.controller;

import com.mycompany.dvdstore.core.entity.Movie;
import com.mycompany.dvdstore.core.service.MovieServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/dvdstore")
public class HomeController {
    public HomeController(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    private final MovieServiceInterface movieService;

    @RequestMapping("/home")
    public @ModelAttribute("movies") List<Movie> displayHome(){
        List<Movie> movies=movieService.getMovieList();
        return movies;
    }
}
