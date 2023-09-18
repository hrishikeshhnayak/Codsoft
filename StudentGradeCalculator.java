import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int n = input.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter the marks of each subject:");
        for (int i = 0; i < n; i++) {
            marks[i] = input.nextInt();
        }
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += marks[i];
        }
        float percentage = (float) total / n;
        System.out.println("Percentage: " + percentage);
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}