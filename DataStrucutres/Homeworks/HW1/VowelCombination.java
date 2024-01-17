
public class VowelCombination {
    public void makeCombinations(String current, int currentLength, int n) {
        if (currentLength == n) {
            System.out.print(current + " ");
            return;
        }

        String vowels = "aeiou";
        for (char vowel : vowels.toCharArray()) {
            makeCombinations(current + vowel, currentLength + 1, n);
        }
    }

    public static void main(String[] args) {
        VowelCombination vc = new VowelCombination();
        vc.makeCombinations("", 0, 4);
    }
}
