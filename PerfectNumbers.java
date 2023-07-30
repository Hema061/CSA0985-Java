import java.util.Scanner;
class PerfectNumbers {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of n: ");
int n = sc.nextInt();
int count = 0;
int num = 1;
while(count < n) {
int sum = 0;
for(int i = 1; i < num; i++) {
if(num % i == 0) {
sum += i;
}
}
if(sum == num) {
System.out.println(num + " is a perfect number");
count++;
}
num++;
}
}
}
