package ma.sqli.brute.force;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("login");
        System.out.println("register");
        String input = scanner.nextLine();
        HashMap users = new HashMap();

        users.put("sqli","0000");
        users.put("admin","123");
        do
        {
            System.out.println("Enter \"login\", \"register\", or \"exit\"");

            if (input.equals("login"))
            {
                System.out.println("username");
                String Luser = scanner.nextLine();
                System.out.println("Password");
                String Lpassword = scanner.nextLine();
                BruteForceApp.login(Luser, Lpassword);
                System.out.println("");
                input = scanner.nextLine();
            }
    else if (input.equals("register"))
            {
                System.out.println("username");
                String Ruser = scanner.nextLine();
                System.out.println("Password");
                String Rpassword = scanner.nextLine();
                BruteForceApp.addUser(Ruser, Rpassword);
                System.out.println("Good!");
                input = scanner.nextLine();
            }
    else if (input.equals("exit"))
            {
                break;
            }
    else      System.out.println("Somethig is wrong!");

        } while (true);

}
}