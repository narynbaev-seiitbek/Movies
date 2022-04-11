package com.company;

import java.util.List;

public interface FindAble {

    void findMoviesByActor(List<Movies> movies,String input);

    void findMoviesByDirector(List<Movies> movies,String input);

    void findMoviesByYear(List<Movies> movies, int name);

    void findMoviesAndRoleByActor(List<Movies> movies,String input);

    void showActorRoles(List<Movies> movies);
}
