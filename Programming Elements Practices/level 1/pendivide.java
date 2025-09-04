import java.util.Scanner;

public class pendivide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of pens:");
        double pens = input.nextDouble();
        System.out.print("Number of students:");
        double students = input.nextDouble();
        double remainder = pens%students;
        System.out.println("Remainder is:" +remainder);
        
    }
}
