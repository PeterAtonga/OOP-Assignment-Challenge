import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double marks;
        

        System.out.println("Enter your marks: ");
        marks = scanner.nextDouble(); // reads a double value from the user

        if (marks >= 80 && marks < 100) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        }else if (marks >= 60) {
                System.out.println("Grade C");
            }
            else if (marks >= 50) {
                System.out.println("Grade D");
            }else {
                    System.out.println("Grade F");

                }

            }
}
