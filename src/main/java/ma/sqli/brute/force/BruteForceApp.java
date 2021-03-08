package ma.sqli.brute.force;

import java.util.HashMap;

/**
 * @author : El Mahdi Benzekri
 * @since : 3/7/21, dim.
 **/
public class BruteForceApp {

            private static String username;
            private  static String mdp;


    public static String login(String admin, String password) {

        if (admin.equals("sqli") && password.equals(mdp) )
            return"Welcome "+admin+"!";

        else if (admin.equals(username) && password.equals(mdp)) {
            return"Welcome "+admin+"!";

        } else if (!admin.equals(username ) || !password.equals(mdp)) {
            for (int count=0; count<=3; count++) {
                if (count == 0)
                {return "User or password are incorrect.";}

                return "Multiple erroneous credentials, your account is locked.";
            }
        }
        return "";

    }

    public static void addUser(String admin, String s) {
        HashMap users = new HashMap();
        users.put(admin,s);
    }
}
