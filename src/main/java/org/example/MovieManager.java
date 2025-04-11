package org.example;


import java.util.Scanner;

public class MovieManager {
    private Scanner scanner = new Scanner(System.in);

    public void manage() {
        System.out.println("\nMovie Management: [1] Add [2] Update [3] Delete");
        int action = Integer.parseInt(scanner.nextLine());

        if (action == 1) {
            addMovie();
        } else if (action == 2) {
            updateMovie();
        } else if (action == 3) {
            deleteMovie();
        }
    }

    public void searchMovies(String query) {
        System.out.println("Searching for movies with: " + query);
        System.out.println("Results: [Movie A, Movie B, Movie C]");
    }

    private void addMovie() {
        System.out.println("Add Movie - (Placeholder functionality)");
    }

    private void updateMovie() {
        System.out.println("Update Movie - (Placeholder functionality)");
    }

    private void deleteMovie() {
        System.out.println("Delete Movie - (Placeholder functionality)");
    }
}
