import java.util.Scanner;
class MultiplicationTable {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number (Table to be calculated): ");
int num = sc.nextInt();
System.out.print("Enter the range: ");
int range = sc.nextInt();
for(int i = 1; i <= range; i++) {
System.out.println(num + " x " + i + " = " + (num * i));
}
}
}
