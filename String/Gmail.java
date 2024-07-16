// Write a program to find we=hether a given mail is gmail or not and also find the username and domain name.

import java.util.*;
public class Gmail {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mail address");
        String str = sc.nextLine();

        int i = str.indexOf("@");
        String uname = str.substring(0, i);
        String domainame = str.substring(i+1, str.length());

        System.out.println(domainame.startsWith("gmail.com"));
        System.out.println("Username is "+uname);
        System.out.println("Domain Name is "+domainame);

        sc.close();
    }
    
}
