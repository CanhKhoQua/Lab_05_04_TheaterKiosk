import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = sc.nextInt();

        if (age >= 21)
        {
            System.out.println("You get a wrist band");
        }
    }
}