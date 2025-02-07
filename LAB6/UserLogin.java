import java.util.Scanner;

class UserLogin {
    private String username;
    private String password;
    UserLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public boolean validateUsername(String username) {
        return this.username.equals(username);
    }
    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }
    public static void main(String[] args) {
        UserLogin[] users = new UserLogin[5];
        users[0] = new UserLogin("Alice", "password123");
        users[1] = new UserLogin("Bob", "secure456");
        users[2] = new UserLogin("Charlie", "charlie789");
        users[3] = new UserLogin("David", "david101");
        users[4] = new UserLogin("Eve", "eve202");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < users.length; i++) {
            System.out.println("Login attempt for user " + (i + 1) + ":");
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();
            
            boolean userFound = false;
            
            // Check each user in the array
            for (UserLogin user : users) {
                if (user.validateUsername(inputUsername)) {
                    userFound = true;
                    if (user.validatePassword(inputPassword)) {
                        System.out.println("Successful login by username " + inputUsername);
                    } else {
                        System.out.println("Password does not match the username " + inputUsername);
                    }
                    break;
                }
            }
            
            if (!userFound) {
                System.out.println("Username invalid");
            }
        }
        
        scanner.close();
    }
}