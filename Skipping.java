import java.util.Scanner;
class Skipping{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter m: ");
int m=input.nextInt();
System.out.println("Enter n: ");
int n=input.nextInt();
System.out.println("Enter k: ");
int k=input.nextInt();
for(int i=m;i<=n;i=i+k+1)
{
 System.out.print(i+" ");
}
}
}