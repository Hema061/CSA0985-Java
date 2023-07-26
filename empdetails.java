import java.io.*;
import java.util.*;
class employee{
int id;
String name;
float salary;
void insert(int i,String n,float s)
{
id=i;
name=n;
salary=s;
}
void display()
{
System.out.println(id+" "+name+"  "+salary);
}
}
class empdetails
{
public static void main(String[] args)
{
employee e1=new employee();
employee e2=new employee();
employee e3=new employee();
Scanner input=new Scanner(System.in);
e1.insert(111,"Harini",35000);
e2.insert(112,"Krithika",45000);
e3.insert(113,"Mownika",50000);
e1.display();
e2.display();
e3.display();
}
}