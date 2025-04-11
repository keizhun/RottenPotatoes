package org.example;

public class Main {
    public static void main(String[] args) {
        AuthService authService = new AuthService();
        User currentUser = authService.login();

        if (currentUser != null) {
            Dashboard dashboard = new Dashboard(currentUser);
            dashboard.show();
        }
    }
}