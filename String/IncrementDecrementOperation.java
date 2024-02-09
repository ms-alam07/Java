// Write a Java program to find the Final Value of the Variable After Performing Operations.

public class IncrementDecrementOperation {
    public static void main(String[] args) {
        String []operations ={"--X","X++","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
    public static int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String op : operations){
            if(op.equals("X++") || op.equals("++X") ){
                X++;
            }
            else if(op.equals("X--") || op.equals("--X")){
                X--;
            }
        }
        return X;        
    }
    
}
