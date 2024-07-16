// Write a java program to fiind the duplicate values in an array of string values.

public class DuplicatesInString {
    public static void main(String[] args) {
        
        String a[] ={"Aadi","Saquib","Ash","Ashu","Aadi","Eram","Nazi","Saquib","Ash"};

        int n = a.length;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].equals(a[j]) && i!= j){
                    System.out.println("Duplicate String Values are: "+a[j]);
                }
            }
        }
    }
}
