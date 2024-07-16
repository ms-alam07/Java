// Write a program to find the type of website and protocol used.

import java.util.*;
public class WebsiteType {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url");
        String url = sc.nextLine();

        String protocol = url.substring(0, url.indexOf(":"));

        if(protocol.equals("http")){
            System.out.println("It is a Hypertext Transfer Protocol");
        }
        else if(protocol.equals("ftp") ){
            System.out.println("It is a File Transfer Protocol");
        }
        else{
            System.out.println("It is Hypertext Transfer Protocol Secure");
        }


        String website = url.substring(url.lastIndexOf(".")+1 );

        if(website.equals("com") ){
            System.out.println("It is a Commercial Website");
        }
        else if(website.equals("org")){
            System.out.println("It is and Organisation Website");
        }
        else if(website.equals("net")){
            System.out.println("It is a Networking Website");
        }
        sc.close();
    }
}
