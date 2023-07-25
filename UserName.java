   import java.util.Scanner;
    class UserName{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = sc.nextLine();
        if (username.matches("^[a-zA-Z0-9._-]{3,}$")) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
    }
}