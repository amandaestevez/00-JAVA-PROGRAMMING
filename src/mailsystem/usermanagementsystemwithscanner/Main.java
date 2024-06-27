package mailsystem.usermanagementsystemwithscanner;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
     private static final List<User> users = new ArrayList<>();
    private static UserManager userManagerInstance;
    
    public static UserManager getInstance() {
      if (userManagerInstance == null) {
        userManagerInstance = new UserManager();
      }
      return userManagerInstance;
    }

    public static void addUser(String name) {
      users.add(new User (users.size() + 1, name));
    }
    
    public static void listUsers() {
      int index = 1;
      for (User user : users){
        System.out.println(index + " - " + user.getName());
        index++;
      }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of users to add: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
   
            // Loop to add users
            for (int i = 1; i <= quantity; i++) {
              System.out.print("Enter name for user " + i + ": ");
              String name = scanner.nextLine();
              addUser(name);
            }
        }

        System.out.println("\nList of Users:");
        listUsers();
      }
    }