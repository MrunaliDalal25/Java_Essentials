import java.util.Scanner;

public class UserInputScanner {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Name:");
           String name=sc.nextLine();

           System.out.println("Enter your age:");
           int age=sc.nextInt();

         System.out.println("Enter your salary");
         double salary=sc.nextDouble();

         System.out.println("Are You working?:(true/false)");
         Boolean isWorking=sc.nextBoolean();
         System.out.println("Hello" + " " + name);
        sc.close();

    }
}
