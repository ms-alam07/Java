public class SingleNumber {
    public static void main(String[] args) {
        int a[]={2,3,4,4,2};

        int n= a.length;
        int ans=0;

        for(int i=0;i<a.length;i++){
            ans = ans^a[i];
        }
        System.out.println(ans);
    }
}
