import java.util.Scanner;

public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the symbol for the pattern:\n");
        char symbol = scanner.next().charAt(0);

        // Take the size of the pattern from the user
        System.out.print("Enter the size of the pattern:\n");
        int size = scanner.nextInt();

        // Print the hollow square pattern
        printHollowSquarePattern(symbol, size);
    }

    // Helper method to print hollow square pattern
    private static void printHollowSquarePattern(char symbol, int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print(symbol + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
