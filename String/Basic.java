public class Basic { 
    public static void main(String[] args) {

        String str1 ="programmer@gmail.com";
        String str2 = new String("PROGRAMMER@GMAIL.COM");
        String str3= "       Hello World   ";

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
    System.out.println(s);

//String to UpperCase
    String s2 = str1.toUpperCase();
    System.out.println(s2);

//Trim the blank spaces
    String s3= str3.trim();
    System.out.println(s3);
    
// Substring with Starting Index
    String s4= str1.substring(a);   // line 13
    System.out.println(s4);
    
// Substring with Starting Index & Last Index       (explicit as @ will not be printed)
    String s5= str1.substring(a+1,str1.length());
    System.out.println(s5);

//Replacing a character in a String
    String s6 = str3.replaceAll("World", "Duniya").trim();
    System.out.println(s6);
    
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

    
    }
    
}
