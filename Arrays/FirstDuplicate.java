public class FirstDuplicate {
    public static void main(String[] args) {
        int a[]={4,6,4,6,3,1};

        for(int i=0;i<a.length-1;i++){
            int temp=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("First Duplicate Element is : "+a[i]);
                    temp=temp+1;
                    break;
                }
            }
            if(temp>0){
                break;
            }
        }
    }
}
