package Inheritance;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid credentials.");
        }
    }

    public void logout() {
        System.out.println("Logged out.");
    }
}
