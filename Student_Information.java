import java.util.Scanner;
public class Student_Information {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        double mark = Double.parseDouble(sc.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, mark);
    }
}