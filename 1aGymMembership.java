import java.util.Scanner;
public class 1aGymMembership {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Gym Membership Interface");
        System.out.print("Enter your name:");
        String name = input.next();
        System.out.print("Enter your age:");
        int age = input.nextInt();
        System.out.print("Enter membership status:");
        boolean Status = input.nextBoolean();
        System.out.print("Enter membership duration:");
        int duration = input.nextInt();
        double fee = duration * 50.0;
        System.out.println("Membership Details");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Status:"+Status);
        System.out.print("Fee:"+fee+"$");


    }
}
