import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CSE 111 Student Grade Calculator ===");
        
        // Take marks input
        System.out.print("Enter Assignment Marks (out of 100): ");
        double assignments = scanner.nextDouble();
        
        System.out.print("Enter Mid-Term Marks (out of 100): ");
        double midTerm = scanner.nextDouble();
        
        System.out.print("Enter End-Term Marks (out of 100): ");
        double endTerm = scanner.nextDouble();
        
        // Calculate weighted final score (ex: 20% assignments, 30% mid, 50% end)
        double finalScore = (assignments * 0.20) + (midTerm * 0.30) + (endTerm * 0.50);
        
        System.out.println("\n---------------------------------");
        System.out.printf("Your Final Weighted Score is: %.2f%%\n", finalScore);
        
        // Determine Grade
        if (finalScore >= 90) {
            System.out.println("Grade: A (Excellent!)");
        } else if (finalScore >= 80) {
            System.out.println("Grade: B (Very Good)");
        } else if (finalScore >= 70) {
            System.out.println("Grade: C (Good)");
        } else if (finalScore >= 50) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail - Needs Improvement)");
        }
        System.out.println("---------------------------------");
        
        scanner.close();
    }
}