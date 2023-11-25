import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user for marks in four subjects
        System.out.print("Enter the marks in Python: ");
        double pythonMarks = scanner.nextDouble();

        System.out.print("Enter the marks in C Programming: ");
        double cProgrammingMarks = scanner.nextDouble();

        System.out.print("Enter the marks in Mathematics: ");
        double mathematicsMarks = scanner.nextDouble();

        System.out.print("Enter the marks in Physics: ");
        double physicsMarks = scanner.nextDouble();

        // Calculate total and aggregate
        double total = pythonMarks + cProgrammingMarks + mathematicsMarks + physicsMarks;
        double aggregate = total / 4;

        // Display total and aggregate
        System.out.println("Total= " + total);
        System.out.println("Aggregate = " + aggregate);

        // Display grade based on aggregate
        displayGrade(aggregate);
    }

    // Helper method to display grade based on aggregate
    private static void displayGrade(double aggregate) {
        System.out.print("Grade: ");

        if (aggregate > 75) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 60 && aggregate < 75) {
            System.out.println("FIRST DIVISION");
        } else if (aggregate >= 50 && aggregate < 60) {
            System.out.println("SECOND DIVISION");
        } else if (aggregate >= 40 && aggregate < 50) {
            System.out.println("THIRD DIVISION");
        } else {
            System.out.println("FAIL");
        }
    }
}
