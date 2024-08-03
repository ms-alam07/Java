public class MyClass {
    public static void main(String[] args) {
        int temp;
        int a[]={23,14,35,2,32,35,36};
        int n = a.length;

        //====================================
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        

        // =====================================
        int temp2[]= new int[n]; // creating new array
        int j=0;
        for(int i=0;i<n-1;i++){
            if(a[i]!=a[i+1]){
                
                temp2[j]=a[i];
                j++;
            }
            
        }
        temp2[j]=a[n-1];
        

        for(int e: temp2){
            System.out.println(e);
        }

    }
}
