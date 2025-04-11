package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class AuthService {
    private Map<String, String> userPasswords = new HashMap<>();
    private Map<String, String> userRoles = new HashMap<>();

        public AuthService() {
            // Dummy accounts
            userPasswords.put("admin", "admin123");
            userRoles.put("admin", "Admin");

            userPasswords.put("user1", "user123");
            userRoles.put("user1", "User");
        }

        public User login() {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Enter Username & Password");
                System.out.print("Username: ");
                String username = scanner.nextLine();
                System.out.print("Password: ");
                String password = scanner.nextLine();

                if (validateCredentials(username, password)) {
                    System.out.println("Login Successful");
                    return new User(username, userRoles.get(username));
                } else {
                    System.out.println("Invalid Credentials. Try Again.\n");
                }
            }
        }

        private boolean validateCredentials(String username, String password) {
            return userPasswords.containsKey(username) && userPasswords.get(username).equals(password);
        }
}

