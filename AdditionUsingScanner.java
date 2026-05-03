import java.util.Scanner;

public class AdditionUsingScanner {
    public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the value of x: ");
                int x = sc.nextInt();

                System.out.print("Enter the value of y: ");
                int y = sc.nextInt();

                int z = x + y;

                System.out.println("The sum is: " + z);

                sc.close();
            }
        }

