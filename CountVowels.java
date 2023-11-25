import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the statement: ");
        String statement = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive counting

        // Count vowels
        int vowelCount = countVowels(statement);

        // Display the result
        System.out.println("Number of vowels = " + vowelCount);
    }

    // Helper method to count vowels in a given string
    private static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
