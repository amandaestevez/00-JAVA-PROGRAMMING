package usermanagementsystemwithscanner;


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
        Scanner scanner = new Scanner(System.in);
        try {
        int quantity = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= quantity; i++) {
            String name = scanner.nextLine();
            addUser(name);
        }

        listUsers();
    } 
    finally {
        scanner.close();
    }
  }
}