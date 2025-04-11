package org.example;

import java.util.Scanner;

public class ReviewManager {
    private Scanner scanner = new Scanner(System.in);

    public void manage() {
        System.out.println("\nReview Management: [1] View [2] Delete");
        int action = Integer.parseInt(scanner.nextLine());

        if (action == 1) {
            viewReviews();
        } else if (action == 2) {
            deleteReview();
        }
    }

    public void saveReview(String movie, String rating, String review) {
        System.out.println("Saving review for " + movie + ": " + rating + " stars - \"" + review + "\"");
    }

    private void viewReviews() {
        System.out.println("View Reviews - (Placeholder functionality)");
    }

    private void deleteReview() {
        System.out.println("Delete Review - (Placeholder functionality)");
    }
}
