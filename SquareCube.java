import java.util.Scanner;
class SquareCube {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double num;
System.out.print("Enter a decimal number: ");
num = sc.nextDouble();
System.out.println("Square of " + num + " is: " + Math.pow(num, 2));
System.out.println("Cube of " + num + " is: " + Math.pow(num, 3));
}
}
