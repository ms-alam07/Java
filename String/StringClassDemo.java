// String class Constructor and Methods.

public class StringClassDemo { 
    public static void main(String[] args) {

        // Constructor
/*
String()
String(String str)
String(char chars[ ])
String(char chars[ ], int startIndex, int count)
String(byte byteArr[ ])
String(byte byteArr[ ], int startIndex, int count)
 */

        String str1 ="programmer@gmail.com";
        String str2 = new String("PROGRAMMER@GMAIL.COM");
        String str3 = "       Hello World   ";
        String str4 ="Hell";

// Length of String
        int j = str2.length();
        System.out.println(j);

//Index of a character in the String
        int a =str1.indexOf("@");
        System.out.println(a);

//Last Index of a character in the String
        int a1 =str1.lastIndexOf("m");
        System.out.println(a1);

//String to LowerCase
    String s= str2.toLowerCase();
    System.out.println("s :"+s);

//String to UpperCase
    String s2 = str1.toUpperCase();
    System.out.println("s2 :"+s2);

//Trim the blank spaces
    String s3= str3.trim();
    System.out.println("s3 :"+s3);
    
// Substring with Starting Index
    String s4= str1.substring(a);   // line 13
    System.out.println("s4 :"+s4);
    
// Substring with Starting Index & Last Index       (explicit as @ will not be printed)
    String s5= str1.substring(a+1,str1.length());
    System.out.println("s5 :"+s5);

//Replacing a character in a String
    String s6 = str3.replaceAll("World", "Duniya").trim();
    System.out.println("s6 :"+s6);

// Concat two Strings
   String s7 = str1.concat(str2);
   System.out.println("s7 :"+s7);

   
// Compare two String Lexographically.(ASCII code difference value ...if first char equal then only compare second char)
   int s8 = str1.compareTo(str2);
   System.out.println("s8 :"+s8);


// Compare Strings ignoring case
   int s9 = str1.compareToIgnoreCase(str3);
   System.out.println("s9 :"+s9);


//Strats with 
    boolean b1 = s5.startsWith("gmail.com");
    System.out.println(b1);

// CharAt index
    char c = str1.charAt(10);
    System.out.println(c);

//Equals Method
    boolean b2= str2.equals(s2);
    System.out.println(b2);

    boolean b3 =str1.equalsIgnoreCase(str2);
    System.out.println(b3);

// Contains Methode
    boolean b4 =str3.contains(str4);
    System.out.println("b4 :"+b4);

// String to CharArray
    //char ch[] =str4.toCharArray();
    //System.out.println("ch :");

    
    
    }
    
}
