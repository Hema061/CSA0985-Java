import java.util.Scanner;
class simpleinterest1{
void display(){
Scanner input = new Scanner(System.in);
System.out.print("Enter the principal amount: ");
int principal = input.nextInt();
System.out.print("Enter the rate of interest: ");
int rate = input.nextInt();
System.out.print("Enter the time period in years: ");
int time = input.nextInt();
if(rate>72){
System.out.println("senior citizen : yes");
} 
else 
{
System.out.println("senior citizen : no");
}
int interest = (principal * rate * time) / 100;
System.out.println("The simple interest is " + interest);
}
public static void main(String[] args) {
Simple s = new Simple();
s.display();
}
} 