import java.io.*;
import java.util.*;
class add{
int length, breath,area;
void display(){
System.out.println("program was executed successfully");
}
}
class rectangle
{
public static void main(String[] args)
{
add r1=new add();
Scanner input =new Scanner(System.in);
System.out.println("enter the length value");
r1.length= input.nextInt();
System.out.println("enter the breath value");
r1.breath= input.nextInt();
r1.area=r1.length*r1.breath;
System.out.println("area of rectangle is :"+r1.area);
r1.display();
}
}