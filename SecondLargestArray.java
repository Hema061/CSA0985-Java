import java.util.Scanner; 
class SecondLargestArray {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the size of the array:");
int size = input.nextInt();
int[] numbers = new int[size];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < size; i++) {
numbers[i] = input.nextInt();
}
input.close();
int first = Integer.MIN_VALUE;
int second = Integer.MIN_VALUE;
for (int number : numbers) {
if (number > first) {
second = first;
first = number;
} 
else if (number > second && number < first) {
second = number;
}
}
System.out.println("The second largest element of the array is " + second);
}
}
