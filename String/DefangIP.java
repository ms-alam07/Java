public class DefangIP {
    public static void main(String[] args) {
        String address ="192.74.55.08";
        String defangedString = defangIPaddr(address);
        System.out.println("Defanged IP Address is: "+defangedString);
    }
    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
   }
}
