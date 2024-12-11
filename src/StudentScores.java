import java.util.Scanner;
public class StudentScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numStudents;

        do {
            System.out.print("Enter total number of students");
            numStudents = input.nextInt();
            if (numStudents < 5 || numStudents > 10) {
                System.out.println("invalid number of students. Enter a number between 5 and 10");
            }
        } while (numStudents < 5 || numStudents > 10);
        int[] scores = new int[numStudents];
        int sum = 0;
        int highest = 0;
        int lowest = 100;

        for (int i = 0; i < numStudents; i++) {
            do {
                System.out.print("\nEnter score for students" + (i + i) + ":");
                scores[i] = input.nextInt();
            } while (scores[i] < 0 || scores[i] > 100);
            sum += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }
        }
        double average = (double) sum / numStudents;
        System.out.println("\nAverage Score = " + average);
        System.out.println("Lowest score = " + lowest);
        System.out.println("Highest score = " + highest);

        System.out.println("\nPass/Fail Results:");
        for(int i = 0; i < numStudents; i++) {
            if(scores[i] >= 50) {
                System.out.println("Students" + (i + 1) + "Score = " + scores[i] + "(Pass)");
            }else {
                System.out.println("Student " + (i + 1) + "Score = " + scores[i] + "(Fall)");
            }
        }
    }
}
