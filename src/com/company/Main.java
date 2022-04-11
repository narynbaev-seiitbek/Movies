package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Movies> movies = JsonIO.getMovies();
    private static MovieStore movieStore = new MovieStore();
    private static FindAble findAble =  new FindByMap();
    private static Scanner in = new Scanner(System.in);
    private static Scanner str = new Scanner(System.in);

    public static void main(String[] args) throws InputException {
        while (true) {

            commads();

            int nextInt = in.nextInt();

            switch (nextInt) {
                case 1:
                    movieStore.printAllMovies(movies);
                    break;
                case 2:
                    String str2 = str.nextLine();
                    movieStore.findMovie(movies, str2);
                    break;
                case 3:
                    movieStore.sortByYear(movies);
                    break;
                case 4:
                    movieStore.sortByName(movies);
                    break;
                case 5:
                    movieStore.sortByDirector(movies);
                    break;
                case 6:
                    String str3 = str.nextLine();
                    findAble.findMoviesByActor(movies, str3);
                    break;
                case 7:
                    String str4 = str.nextLine();
                    findAble.findMoviesByDirector(movies, str4);
                    break;
                case 8:
                    int in2 = in.nextInt();
                    findAble.findMoviesByYear(movies, in2);
                    break;
                case 9:
                    String str5 = str.nextLine();
                    findAble.findMoviesAndRoleByActor(movies, str5);
                    break;
                case 10:
                    findAble.showActorRoles(movies);
                    break;
            }

        }

    }


    static void commads() {
        System.out.println("--------------Commands-----------------------");
        System.out.println("Press 1 to print catalog");
        System.out.println("Press 2 to Find a Movie by full or part name");
        System.out.println("Press 3 to sort by year");
        System.out.println("Press 4 to sort by name");
        System.out.println("Press 5 to sort by director");
        System.out.println("Press 6 to find movies by actor's name");
        System.out.println("Press 7 to find movies by director's name");
        System.out.println("Press 8 to find movies by year");
        System.out.println("Press 9 to List all movies and roles by actor's name");
        System.out.println("Press 10 to sorted List of all actors with his roles");
        System.out.println("---------------------------------------------");
    }

    static int getInt() {
        System.out.print("Write year ");
        int a = 0;
        try {
            String b = in.next();
            a = Integer.parseInt(b);
        } catch (Exception e) {
            System.out.println("Wrong again, try again");
            e.printStackTrace();
        }
        return a;
    }
}
