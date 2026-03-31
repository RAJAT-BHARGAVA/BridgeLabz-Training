
public class MostFrequentCharacter {
    public static void main(String[] args) {
        String input = "success";
        int[] frequency = new int[256];
        for (int i = 0; i < input.length(); i++) {
            frequency[input.charAt(i)]++;
        }
        char mostFrequentChar = ' ';
        int maxCount = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                mostFrequentChar = (char) i;
            }
        }
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}