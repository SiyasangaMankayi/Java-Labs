package Lab2;

import java.util.Scanner;

public class LoginCheck {
    String username = "Mkhehle";
    String password = "321";

   public void loginDetails(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = scan.next();

        System.out.print("Enter Password ");
        String pass = scan.next();

        if(user.equals(username)) {
           System.out.println("Login Successfully");

           if(pass.equals(password))  {
                System.out.println("Loggin Successfully");
            }
          else {
              System.out.println("Invalid credentials");
           }
        }
    }
}
