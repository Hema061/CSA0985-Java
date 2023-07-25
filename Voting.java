 class Voting {
 public static void main(String[] args) 
 {
    int age=19,diff;
    if(age>=18)
    {
    System.out.println("You are eligible for voting.");
    }
    else
    {
    diff = (18 - age);
    System.out.println("Sorry,You can vote after: "+ diff + " years");
    }
 }
}