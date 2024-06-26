package mailsystem.usermanagementwithbufferedreader;
import java.util.ArrayList;
import java.util.List;

public class UserManager{
    private static final List<User> users = new ArrayList<>();
    private static UserManager userManagerInstance;

    private UserManager(){
    }

    public static UserManager getInstance(){
      if (userManagerInstance == null){
        userManagerInstance = new UserManager();
      }
      return userManagerInstance;
    }
    
    public void addUser(String name){
      users.add(new User (users.size() + 1, name));
    }

    public void listUsers(){
      System.out.println("Users registered. ");
      for (User user : users){
        System.out.println(user.getName());
      }
    }
}