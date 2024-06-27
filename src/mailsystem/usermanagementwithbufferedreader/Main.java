package mailsystem.usermanagementwithbufferedreader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
    public static void main(String[] args) throws IOException{
      final BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Insert the amount of users you want to register: ");
      int quantity = Integer.parseInt(userInput.readLine());
      for (int i = 1; i <= quantity; i++){
        System.out.println("Insert the users name ");
        String name = userInput.readLine();
        UserManager.getInstance().addUser(name);
      }
      UserManager.getInstance().listUsers();
    }
}
