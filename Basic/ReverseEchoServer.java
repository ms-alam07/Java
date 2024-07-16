import java.io.*;
import java.net.*;

public class ReverseEchoServer {
    public static void main(String[] args)throws Exception{
        
        ServerSocket ss= new ServerSocket(2000); // ServerSocket is used to bring connection between client and server
        Socket s = ss.accept(); // using port number the connection is established
        BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream())); // from a socket getInputStream convert a inputstream into a reader by using a class InputStreamReader
        PrintStream ps = new PrintStream(s.getOutputStream()); // creating an OutputStream

        String msg;
        StringBuilder sb; // we have used object of stringBuilder so that we can easily reverse the msg 
        do{
            msg= br.readLine(); // reading the message

            sb= new StringBuilder(msg); // reversing the message
            sb.reverse();
            msg = s.toString();

            ps.println(msg); // printing the message

        }while(!msg.equals("dne"));
        ss.close();
    }
}

class client {
    public static void main(String[] args)throws Exception{
        
        Socket stk = new Socket("192.168.29.61",2000); // using IP Address and port number the connection is established
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br= new BufferedReader(new InputStreamReader(stk.getInputStream())); // from a socket getInputStream convert a inputstream into a reader by using a class InputStreamReader
        PrintStream ps = new PrintStream(stk.getOutputStream()); // creating an OutputStream

        String msg;
       
        do{
            msg= key.readLine(); // reading the message
            ps.println(msg); // printing the message
            msg=br.readLine();
            System.out.println("From Server"+msg);

        }while(!msg.equals("dne"));
        stk.close();
    }
}