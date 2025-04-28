import java.util.Scanner;

public class challenge4 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    int age;
    int currentYear;
    int yearofBirth;
    String name;

    System.out.println("Enter your name: ");
    name = scanner.nextLine();

    System.out.println("Enter the current year: ");
    currentYear = scanner.nextInt();

    System.out.println("Enter your year of birth: ");
    yearofBirth = scanner.nextInt();

    age = currentYear - yearofBirth;

    System.out.println("Hello " + name + " you are " + age + " years old");

}
}
