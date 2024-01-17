import java.util.*;

public class PalindromeString {
    public boolean makeCombinations(String current) {
        StringBuilder reverse = new StringBuilder();
        reverse.append(current);
 
        reverse.reverse();
        return reverse.toString().equals(current);
    }

    public static void main(String[] args) {
        PalindromeString ps = new PalindromeString();
        System.out.print(ps.makeCombinations("aua"));
    }
}
