package org.example;
import java.util.Scanner;

public class Dashboard {
    private User user;
    private Scanner scanner = new Scanner(System.in);
    private MovieManager movieManager = new MovieManager();
    private ReviewManager reviewManager = new ReviewManager();

    public Dashboard(User user) {
        this.user = user;
    }

    public void show() {
        if (user.getRole().equals("Admin")) {
            showAdminDashboard();
        }
        mainMenu();
    }

    private void showAdminDashboard() {
        System.out.println("\nAdmin Dashboard: [1] Manage Movies [2] Manage Reviews [3] Main Menu");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            movieManager.manage();
        } else if (choice == 2) {
            reviewManager.manage();
        }
    }

    private void mainMenu() {
        while (true) {
            System.out.println("\nSelect Action: [1] Browse Movies [2] Rate & Review [3] Logout");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                System.out.print("Enter search/filter criteria: ");
                String query = scanner.nextLine();
                movieManager.searchMovies(query);
            } else if (choice == 2) {
                System.out.print("Movie: ");
                String movie = scanner.nextLine();
                System.out.print("Rating: ");
                String rating = scanner.nextLine();
                System.out.print("Review: ");
                String review = scanner.nextLine();

                if (rating.isEmpty() || review.isEmpty()) {
                    System.out.println("Error: Rating & Review cannot be empty.");
                } else {
                    System.out.print("Submit review? (Y/N): ");
                    String confirm = scanner.nextLine();
                    if (confirm.equalsIgnoreCase("Y")) {
                        reviewManager.saveReview(movie, rating, review);
                        System.out.println("Review Submitted Successfully.");
                    }
                }
            } else if (choice == 3) {
                System.out.println("Logging out... Goodbye!");
                break;
            }
        }
    }
}
