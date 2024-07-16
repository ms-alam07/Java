public class KLargest {
    public static void main(String[] args) {
        int a[]={36,25,6,18,19,27};

        int temp;
        int n=a.length;
        int k=5;
        if(k>=n) return;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i == k-1){
                System.out.println(k+"th Largest Element is: "+a[i]);
                break;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
