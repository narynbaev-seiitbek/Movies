package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStore implements SortAble{

    @Override
    public void printAllMovies(List<Movies> movies) {
        movies.forEach(System.out::println);

    }

    @Override
    public void findMovie(List<Movies> movies,String input) {
        movies.stream().map(Movies::getName).filter(name->name.equalsIgnoreCase(input)).forEach(System.out::println);

    }

    @Override
    public void sortByYear(List<Movies> movies) {
        movies.stream().sorted(Comparator.comparing(Movies::getYear)).forEach(System.out::println);

    }

    @Override
    public void sortByName(List<Movies> movies) {
        movies.stream().sorted(Comparator.comparing(Movies::getName)).forEach(System.out::println);

    }

    @Override
    public void sortByDirector(List<Movies> movies) {
            Map<Director, List<Movies>> directorListMap = movies.stream()
                    .collect(Collectors.groupingBy(Movies::getDirector));
            directorListMap.forEach((director, movies1) -> {
                System.out.println(director);
                movies1.forEach(System.out::println);
                System.out.println();
            });
        }

}
