class Rectangle{
double length;
double breadth;
Rectangle(double l, double b){
length = l;
breadth = b;
}
double getArea(){
return length * breadth;
}
}
class RectConstructor{
public static void main(String[] args) {
Rectangle r1 = new Rectangle(4, 5);
Rectangle r2 = new Rectangle(5, 8);
double getArea1 = r1.getArea();
double getArea2 = r2.getArea();
System.out.println("The area of the first rectangle is: " + getArea1);
System.out.println("The area of the second rectangle is: " + getArea2);
}
}
