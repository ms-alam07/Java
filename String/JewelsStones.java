// You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
public class JewelsStones {
    public static void main(String[] args) {
        String jewels ="aA";
        String stones ="aAAAbbba";
        System.out.println(numJewelsInStones(jewels,stones));

    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) { 
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
