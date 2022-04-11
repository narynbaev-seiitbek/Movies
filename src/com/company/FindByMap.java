package com.company;

import java.util.List;

public class FindByMap implements FindAble{
    @Override
    public void findMoviesByActor(List<Movies> movies, String input) {
        movies.stream()
                .filter(movie -> movie.getCast().stream().anyMatch(cast -> cast.getFullName().equalsIgnoreCase(input)))
                .forEach(System.out::println);
    }

    @Override
    public void findMoviesByDirector(List<Movies> movies, String input) {
            movies.stream().filter(movies1 -> movies1.getDirector().getFullName()
                    .equalsIgnoreCase(input)).forEach(System.out::println);

        }

    @Override
    public void findMoviesByYear(List<Movies> movies, int name) {
        movies.stream().filter(movies1 -> movies1.getYear()==name).forEach(System.out::println);
    }

    @Override
    public void findMoviesAndRoleByActor(List<Movies> movies, String input) {
        movies.stream().filter(movies1 -> movies1.getCast().stream()
                        .anyMatch(cast -> cast.getFullName().equalsIgnoreCase(input)))
                .forEach(System.out::println);
    }

    @Override
    public void showActorRoles(List<Movies> movies) {
        movies.forEach(Movies::printCast);
    }
}
