class MaxMinArray {
public static void main(String[] args) {
int[] numbers = {10, 20, 30, 40, 50};
int max = numbers[0];
int min = numbers[0];
for (int number : numbers) {
if (number > max) {
max = number;
}
if (number < min) {
min = number;
}
}
System.out.println("The maximum element of the array is " + max);
System.out.println("The minimum element of the array is " + min);
}
}
